package C03Inheritance;

//부모클래스(SuperParents)에 객체변수 a선언 10할당
//부모 클래스에 메서드 display 안에 "부모클래스입니다." 출력
//자식클래스에서 상속받고 부모클래스의 변수 a출력, 부모클래스의 display 호출
public class C0302SuperKeyword extends SuperParents {
    int a;
    C0302SuperKeyword(){
        //super(); 부모클래스의 생성자를 의미
        super(10);
        a = 20;
    }
    public static void main(String[] args) {
        C0302SuperKeyword c1 = new C0302SuperKeyword();
        //int a = 10;//private가 없다면 이것도 가능하다.
        //System.out.println(c1.a); // 0이 나온다. 초기화가 안되어있기 때문이다. //자식 클래스의 기본생성자 호출한 것.
        //c1.display();
        //System.out.println(c1.a); // 20이 출력된다.
        c1.display2();
    }

    void display2(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
class SuperParents{
    int a;
    //생성자
    SuperParents(int a){
        this.a = a;
    }
    //기본생성자
    SuperParents(){

    }

    void display(){
        System.out.println("부모클래스입니다.");
        System.out.println(this.a);
    }
}