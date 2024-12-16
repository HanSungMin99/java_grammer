package C05AnonymousLambda;

public class C0501InnerClass {
    public static void main(String[] args) {
        MemberInnerClass mi = new MemberInnerClass();
        mi.display(); //0이 나옴, 초기화 안되어 있으므로

        MemberInnerClass.StaticInnerClass si = new MemberInnerClass.StaticInnerClass();
        si.display(); //10이 나옴
    }
}
//(일반)내부 클래스
class MemberInnerClass{
    int a;
    void display(){
        System.out.println("a의 값은 " + this.a);
    }
    //static 내부 클래스: 밖의 MemberInnerClass의 static변수처럼 활용
    static class StaticInnerClass{ // 이걸 가지고 또 객체를 만들 수 있음
        int b = 10;
        void display(){
            System.out.println("b의 값은 " + this.b);
        }
    }
}
