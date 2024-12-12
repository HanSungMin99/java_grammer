package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
        System.out.println(MyCalculator.sum(10,20));

        //A부서의 매출
        //20원 매출
        MyCalculator.sumAcc(20);
        System.out.println(MyCalculator.total);
        //30원 매출
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);
        //40월 매출
        MyCalculator.sumAcc(40);
        System.out.println(MyCalculator.total);

        //B부서의 매출
        //10원 매출
        MyCalculator.total = 0; //같은 프로그램 사용하므로 0으로 세팅안해주면 A부서 매출에 누적된다.
        MyCalculator.sumAcc(10);
        //20원 매출
        MyCalculator.sumAcc(10);
        System.out.println(MyCalculator.total);

        //이때 다시 A부서 매출 계산하면 누적값이 제대로 계산이 안된다. 따라서 원본이 아닌 복제본이 필요하다.

        //객체를 사용한 회계프로그램: 객체 고유의 메모리 공간 할당
        MyCalculatorInstance m1 = new MyCalculatorInstance();
        MyCalculatorInstance.total_count += 1;
        m1.sumAcc(10);
        m1.sumAcc(20);
        System.out.println(m1.total);
        MyCalculatorInstance m2 = new MyCalculatorInstance();
        MyCalculatorInstance.total_count += 1;
        m2.sumAcc(30);
        m2.sumAcc(40);
        System.out.println(m2.total);
        System.out.println(MyCalculatorInstance.total_count);

        //이름세팅, eating()메서드 호출
        C0202Person p1 = new C0202Person();
        p1.setName("hongildong");
        p1.setAge(30);
        p1.setEmail("hongildong@naver.com");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());
        p1.eating();
        System.out.println(p1.whoIs());
    }
}

class MyCalculator{ //class 앞에 default가 생략됨, default는 이 패키지 안에서만 접근 가능
    //staticdl 붙어있는 변수는 클래스 변수, static이 붙어있지 않으면 객체변수(중요)
    static int total = 0; //class 바로 밑에 쓰는 변수에는 2종류 있다. static이 붙는 클래스 변수, static이 안붙는 객체 변수
    static int sum(int a, int b){ //static를 붙이면 static 메서드 또는 클래스메서드 라고 함, 안붙으면 객체 메서드.
        return a+b;
    }
    static void sumAcc(int a) {
        total += a;
    }
}

class MyCalculatorInstance { //이것은 원본, 이것을 통해 복제본을 만들 것이다.
    static int total_count = 0;
    int total = 0;

    public MyCalculatorInstance(){
        total_count +=1;
    }

    void sumAcc(int a) {
        //this는 객체 그 자신을 의미
        //예를들어 m1객체일 경우 m1.total, m2객체일 경우 m2.total
        //일반적으로, 매개변수와 객체변수를 구분짓기 위해 사용해야 함(생략가능 - 매개변수와 이름이 같지 않을 경우)
        this.total += a;
    }
}