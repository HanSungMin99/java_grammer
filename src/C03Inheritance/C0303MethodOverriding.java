package C03Inheritance;

//메서드 오버로딩, 오버라이딩의 차이 외우기
//정의를 제대로 알고 있기.

public class C0303MethodOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound(); //덮어쓰기가 되어 멍멍이 나온다.
        d1.sound2(); // 멍멍멍이 나온다.

        //상속관계일때 부모클래스의 타입을 자식클래스 객체의 타입으로 지정가능
        //animal클래스에 정의된 메서드만 사용가능하도록 타입의 제약 발생
        Animal d2 = new Dog(); //dog과 animal이 상속관게일때 사용 가능하다. Dog으로 새로운 객체를 만들었다. 타입은 Animal로 쓰겠다. 쓸 수 있는 메서드를 제한한다.
        d2.sound();//sound2가 없다. d2는 Dog의 객체라서 멍멍이 나온다.
        //d2.sound2();//사용불가

    }
}

class Animal{
    void sound(){
        System.out.println("동물의 소리를 냅니다.");
    }
}

class Dog extends Animal{
    @Override //가독성을 높여준다.
    void sound(){ //Animal 클래스의 sound를 오버라이딩하였다.
        System.out.println("멍멍");
    }
    void sound2(){
        System.out.println("멍멍멍");
    }

}

class Cat extends Animal{ //부모 클래스 하나에 여러 자식 클래스 가능하다.

}
