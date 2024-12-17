package C03Inheritance;

//final 클래스는 상속 불가하다.
//public class C0305Others extends FinalParents{

public class C0305Others {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makeSound2();

        //추상클래스와 인터페이스는 별도의 구현없이 객체생성 불가하다.
        //AbstractAnimals a1 = new AbstractAnimals();
        //List<Integer> list1 = new list<Integer>();
    }
}

//abstract 메서드가 하나라도 있으면, 반드시 클래스에도 abstract키워드가 붙어야 한다(추상클래스로 만들어야 한다: 객체 생성 안됨, 상속 시 자식쪽에서 무조건 오버라이딩해줘야 한다)
abstract class AbstractAnimals{
    void makeSound1(){
        System.out.println("동물소리를 냅니다.");
    }
    //리턴타입과 매개변수만 있는 메서드 선언만 존재
    abstract void makeSound2(); //abstract메서드는 abstract class 아래에서만 만들 수 있다.
}

class AbstractDog extends AbstractAnimals{
    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
    //abstract 클래스를 상속받을 때에는 overriding이 강제된다.
}

