package C03Inheritance.ProtectedPackage;

import C03Inheritance.C0304ProtectedClass;

public class ProtectedTest extends C0304ProtectedClass {
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
        //public변수 접근가능
        System.out.println(c1.st4);
        //protected변수 접근 불가능: 상속관계없을 경우 접근 불가능
        //상속관계를 하더라도 c1.st3로는 접근 불가능하다. 왜냐하면 ProtectedTest로 새로 선언해서 그런 것이 아니기 때문이다.
        //System.out.println(c1.st3);
        //default는 패키지가 변경되었기 때문에 사용 불가능하다.
        //System.out.println(c1.st2);
        //System.out.println(c1.st1);

        //상속관계에 있는 경우, ProtectedTest객체를 만들면 접근 가능하다.
        ProtectedTest p1 = new ProtectedTest();
        System.out.println(p1.st3);
        //상속관계에 있다 하더라도 default 변수는 접근 불가하다.
        //System.out.println(p1.st2);
    }
}
