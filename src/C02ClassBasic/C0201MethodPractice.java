package C02ClassBasic;

import java.util.*;

public class C0201MethodPractice {
    public static void main(String[] args) {
        if(isPrime(11)){
            System.out.println("소수입니다");
        }else{
            System.out.println("소수가 아닙니다.");
        }
    }
    public static boolean isPrime(int input) {
        boolean answer = true;
        for (int i = 2; i * i <= input; i++) {
            if (input% i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
