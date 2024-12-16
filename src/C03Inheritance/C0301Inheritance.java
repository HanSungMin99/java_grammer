package C03Inheritance;

//extends 키워드를 통해 변수와 메서드 상속을 수행
public class C0301Inheritance extends Parents{
    //int a = 20; //변수 재정의해도 아무 문제 없다.
    int c = 10; //변수 추가해도 아무 문제 없다.
    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
        //변수 상속
        System.out.println(c1.a);
        System.out.println(c1.c);
        //private 변수, 메서드는 자식 클래스에서 사용(접근) 불가
        //System.out.println(c1.b);

        //메서드 상속
        c1.m1(); //자식클래스입니다.가 출력된다. 덮어쓰기 되기 때문이다.
        c1.m2(); //아무 문제 없음
    }
    //부모 메서드의 재정의: overriding
    //@Override: override임을 명시적으로 표현하는 표현식, 성능을 위해서 붙여주는게 더 좋은 것으로 알려져있음.
    @Override
    void m1(){
        System.out.println("자식클래스 입니다.");//부모메서드를 상속받았지만 메서드를 재정의해도 된다.//자식클래스가 우선한다.
    }
    void m2(){
        System.out.println("클래스2 입니다.");//메서드 추가해도 전혀 문제 없다.
    }
}
class Parents{
    int a = 10; //앞에 default가 생략되어 있다.
    private int b = 20; //private를 붙이면 상속받는다해도 쓰지 못한다.
    void m1(){ //앞에 default가 생략되어 있는 것이다. default: 패키지 내에서 가능하다.
        System.out.println("클래스 입니다.");
        System.out.println(b);//클래스 내에서 불러오는 것은 상관없다.
    }
}