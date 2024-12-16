package C04Interface.BankService;

import java.util.Scanner;

public class BankCardService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        int newBalance = ba.getBalance() + money;  // 입금 후 새로운 잔액 계산
        ba.updateBalance(newBalance);  // 잔액 업데이트
        System.out.println(money + "원 카드로 입금되었습니다.");
        System.out.println("현재 잔액은 " + ba.getBalance() + "원 입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        int newBalance = ba.getBalance() - money;  // 출금 후 새로운 잔액 계산
        if (newBalance >= 0) {
            ba.updateBalance(newBalance);  // 잔액 업데이트
            System.out.println(money + "원 카드로 출금되었습니다.");
            System.out.println("현재 잔액은 " + ba.getBalance() + "원 입니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }


    //조건
    //입금시
    //xx원 카드로 입금되었습니다.
    //현재 잔액은 yy원 입니다.

    //출금시
    //xx원 카드로 출금되었습니다.
    //현재 잔액은 yy원 입니다.

}
