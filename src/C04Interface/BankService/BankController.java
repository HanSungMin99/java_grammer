package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("계좌번호 입력해주세요");
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber, 0); //초기 잔액은 0으로 설정

        while (true){
            System.out.println("입금하시려면 1번, 출금하시려면 2번, 종료하시려면 3번");
            String input = sc.nextLine();

            if(input.equals("1")){
                System.out.println("입금하실 금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("입금방식을 선택해주세요. 1.카드 2.카카오페이");
                String input2 = sc.nextLine();

                BankService service = null; //BankService bs; 로 해도 된다.
                if(input2.equals("1")){
                    service = new BankCardService(); //카드서비스 객체 생성, bs = new BankCardService(); 해도 된다.
                }else if (input2.equals("2")){
                    service = new BankKakaoService(); //카카오서비스 객체 생성
                }

                if (service != null){
                    service.deposit(money, ba); //해당 방식으로 입금
                }
            }else if (input.equals("2")) {
                System.out.println("출금하실 금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("출금방식을 선택해주세요. 1.카드 2.카카오페이");
                String input2 = sc.nextLine();

                BankService service = null;
                if(input2.equals("1")){
                    service = new BankCardService(); //카드서비스 객체 생성
                }else if (input2.equals("2")){
                    service = new BankKakaoService(); //카카오서비스 객체 생성
                }
                if (service != null){
                    service.withdraw(money, ba); //해당 방식으로 출금
                }
            }else if(input.equals("3")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
        sc.close();
    }
}
