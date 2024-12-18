package C06EtcClass;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0604GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "c"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10,20,30};
        IntegerChange(intArr, 0,1);
        System.out.println(Arrays.toString(intArr));

        //generic을 사용한 메서드 활용
        genericChange(stArr, 1,2);
        genericChange(intArr, 1,2);


        Person p1 = new Person("hongildong"); //특정 클래스의 특정 valuer값을 유연하게 할 수 없을까?
        System.out.println(p1.getValue());
        //generic을 사용하여 범용적 클래스(객체) 생성
        //generic특성상 <>안에 원시형 자료형 들어갈 수 없음. int들어갈 수 없음.
        GenericPerson<Integer> p2 = new GenericPerson<>(10);
        System.out.println(p2.getValue());

        //제네릭의 사용 예시: generic으로 만들어진 클래스(객체)의 예
        List<String> myList = new ArrayList<>();
        Stream<String> myStream;
        Optional<String> optional;
        //int는 기본형이라서 <>안에 들어갈 수 없어 따로 만들어져 있음
        IntStream intStream;
        OptionalInt optionalInt;

        //제네릭 타입소거: 제네릭 타입소거라는 이슈가 있다는 정도만 알아두기
    }

    static void stChange(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void IntegerChange(Integer[] arr, int a, int b){
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //제네릭메서드는 반환타입 왼쪽에 <T>선언.
    //유의점으로 T에는 참조형 변수인 객체타입 들어와야 함.
    static <T> void genericChange(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

class Person{
    private String value;

    public Person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

//제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T>{
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}