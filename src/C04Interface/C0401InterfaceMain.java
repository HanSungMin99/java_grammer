package C04Interface;

public class C0401InterfaceMain {
    public static void main(String[] args) {
//        C0401Cat c1 = new C0401Cat();
//        c1.makeSound();
//        C0401Dog d1 = new C0401Dog();
//        d1.makeSound();
//
//        //다형성: 하나의 객체가 여러 개의 참조변수 타입을 가질 수 있음을 의미한다.
//        //c2의 타입을 정하는 것은 왼쪽이다. Cat에 makeSound2가 있어도 사용할 수 없음
//        //개발의 표준을 맞추기 쉽다.
//        C0401AnimalInterface1 c2 = new C0401Cat();
//        c2.makeSound();
//        C0401AnimalInterface1 d2 = new C0401Dog();
//        d2.makeSound();



        //다중상속(구현)
        C0401CatMultiImpl c1 = new C0401CatMultiImpl();
        c1.makeSound();

        C0401AnimalInterface2 d1 = new C0401DogMultiImpl();
        System.out.println(d1.play("진돗개", "시바견"));

        //기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명객체방식으로 생성가능
        C0401AnimalInterface1 ci1 = new C0401AnimalInterface1() {
            @Override
            public void makeSound() {
                System.out.println("hello world");
            }
        };
        ci1.makeSound();

    }
}
