package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
        System.out.println(MyCalculator.sum(10,20));
    }
}

class MyCalculator{ //class 앞에 default가 생략됨, default는 이 패키지 안에서만 접근 가능
    static int sum(int a, int b){
        return a+b;
    }
    static int sumAcc(){
        return 0;
    }
}
