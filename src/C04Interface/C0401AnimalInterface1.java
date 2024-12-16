package C04Interface;
//1. 상속하고 있는 쪽에서 구현 강제
//2. 인터페이스 객체명 = new 구현된 클래스 (인터페이스 쓰면 안됨)
//왜 인터페이스를 왼쪽에 쓰는가? 제약을 걸 수 있음. 호환성문제(객체를 쉽게 바꿀 수 있다)

public interface C0401AnimalInterface1 {
    void makeSound();
}
