package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        while (true){
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("입금하실 금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("입금방식을 선택해주세요. 1.카드 2.카카오페이");
                String input2 = sc.nextLine();
                if(input2.equals("1")){
                    //카드서비스 객체 생성
                    //객체.deposit(money, ba);
                }else {
                    //카카오서비스 객체 생성
                    //객체.deposit(money, ba);
                }
            }else {
                System.out.println("출금하실 금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("출금방식을 선택해주세요. 1.카드 2.카카오페이");
                String input2 = sc.nextLine();
                if(input2.equals("1")){
                    //카드서비스 객체 생성
                        //객체.withdraw(money, ba);
                }else {
                    //카카오서비스 객체 생성
                    //객체.withdraw(money, ba);
                }
            }
        }
    }
}
