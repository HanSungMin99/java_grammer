package C05AnonymousLambda;

import java.util.*;


//중요한 부분임, 실습도 많이할 예정, Comparator가 더 중요
public class C0503ComparableComparator {
    public static void main(String[] args) {
//        //자바에서는 비교를 위한 인터페이스 대표적으로 2개를 제공
//        //Comparable 인터페이스는 comparaeTo메서드 선언
//        //Comparator 인터페이스는 compare메서드 선언
//
//        //String클래스에 comparaeTo메서드 내장
//        //Stirng 클래스 외에 java의 많은 클래스에서 compareTo를 구현(comparable 인터페이스 구현)
//        String a = "hello";
//        String b = "world";
//        //두 문자열의 각 자리를 순차적으로 비교, 비교결과는 유니코드값의 차이를 반환
//        System.out.println(a.compareTo(b));
//
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList);
//        myList.sort(Comparator.naturalOrder());
//
//        List<Student> myList2 = new ArrayList<>();
//        myList2.add(new Student("kim", 24));
//        myList2.add(new Student("lee", 21));
//        myList2.add(new Student("park", 35));
//        myList2.add(new Student("choi", 15));
//        myList2.add(new Student("kim", 30));
//        //방법1: Student 객체에서 Comparable을 구현한 방식
//        Collections.sort(myList2); //myList2 요소인 Student 객체 안에 Comparable 인터페이스를 구현한 compareTo 메서드가 있어야 함.
//        System.out.println(myList2); //toStirng 정의되어 있지 않아 메모리주소값이 나온다. 아래에서 toString 정의 후 제대로 나옴
//
//        //방법2: Comparator를 구현한 익명객체를 sort에 매개변수로 주입(훨씬 편한 방법)
//        myList2.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //return o1.getAge() - o2.getAge(); // 나이를 기준으로 오름차순 정렬
//                //return o2.getAge() - o1.getAge(); // 나이를 기준으로 내림차순 정렬
//                return o1.getName().compareTo(o2.getName()); // 이름을 기준으로 오름차순 정렬
//            }
//        });
//
//        //Comparator를 람다함수 활용하여 myList 정렬: 이름을 기준으로 내림차순, 이름 같으면 나이로 오름차순
//        myList2.sort((a,b)-> {
//            if(a.getName().compareTo(b.getName())==0){
//                return a.getAge() - b.getAge();
//            }else {
//                return b.getName().compareTo(a.getName());
//            }
//        });
//        System.out.println(myList2);


        String[] stArr = {"hello", "java", "C++", "world2"};
        Arrays.sort(stArr);
        System.out.println(Arrays.toString(stArr));

        //글자 길이를 기준으로 내림차순 정렬해라.
        Arrays.sort(stArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(Arrays.toString(stArr));

        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        for(String a: stArr){
            pq.add(a);
        }
        while (! pq.isEmpty()){
            System.out.println(pq.poll());
        }

        //백준: 절대값 힙(11286)
        //절대값 구하는 방법(문제풀때 참고)
        int a = -1;
        System.out.println(Math.abs(a));


        //[4,5], [1,2], [5,0], [3,1]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});
        //정렬조건: 리스트 안의 배열에 index 1번째 값을 기준으로 오름차순
        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for(int[] m : myList){
            System.out.println(Arrays.toString(m));
        }

        //프로그래머스 = 가장 큰 수
        int[] numbers = {3, 30, 34, 5, 9 };
        String[] arr = {"3", "30", "34", "5", "9"};
        //내림차순 정렬의 문제점: 9 5 34 30 3
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}


//class Student implements Comparable<Student>{
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//
//
//    //정렬은 결국 2개의 값을 비교하는 것이므로, A와 B 대상 2개만 있으면 충분
//    //두 수(또는 문자)의 비교의 경우 음수, 0, 양수 세 값 중에 하나만 return되게 되고, 이를 통해 정렬이 이루어짐
//    //기준이 되는 A(this)가 앞에 있을 땐 오름차순, 뒤에 있으면 내림차순으로 내부적으로 정렬된다.
//    @Override
//    public int compareTo(Student o) {
//        //return this.getAge()-o.getAge();//나이로 오름차순 정렬된다.
//        //return o.getAge()-this.getAge();//나이로 내림차순 정렬된다.
//        return this.getName().compareTo(o.getName());//이름으로 오름차순 정렬된다.
//        //return o.getName().compareTo(this.getName());//이름으로 내림차순 정렬된다.
//    }
//
//
//    //객체 호출시에 자동으로 메모리 주소가 아닌 내용이 출력되게 하려면 toString메서드를 구현해야 한다.
//    //java의 모든 클래스는 조상클래스인 Object클래스를 상속하고, 아래의 override는 Object클래스의 toString메서드를 구현한  것
//    @Override
//    public String toString(){
//        return "이름은 " + this.name + " 나이는 " + this.age ;
//    }
//}
//
//    }
//}


//aaa, bbb : b의 아스키코드 수가 더 크다.
//aaa.compareTo(bbb) -> 음수
//bbb.compareTo(aaa) -> 양수
//this를 앞에 두면 오름차순
//o를 앞에 두면 내림차순


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}