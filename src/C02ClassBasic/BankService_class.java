package C02ClassBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankService_class {
    public static void main(String[] args) {
//        프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.개설 : 계좌번호와 현재가지고 계신돈을 입력하세요.
//        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증)
//        5.송금 : 송금서비스입니다. user1과 user2의 송금금액을 입력해주세요.(잔액검증)
        Map<String, BankAccount> map = new HashMap<>();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("서비스 번호를 입력해주세요. 1.개설 2.조회 3.입금 4.출금 5.송금");
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                System.out.println("계좌금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba = new BankAccount(accountNumber, money);
                map.put(accountNumber, ba);
            }else if(input.equals("2")){
                System.out.println("조회입니다. 계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                BankAccount ba = map.get(accountNumber);
                System.out.println("현재 잔고는 "+ba.getBalance());
            }else if(input.equals("3")){
                System.out.println("입금입니다. 계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                System.out.println("입금금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba = map.get(accountNumber);
                ba.deposit(money);
            }else if(input.equals("4")){
                System.out.println("출금입니다. 계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                System.out.println("출금금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba = map.get(accountNumber);
                ba.withdraw(money);
            }else if(input.equals("5")){
                System.out.println("송금입니다. 본인계좌번호를 입력해주세요");
                String accountNumber1 = sc.nextLine();
                System.out.println("상대방계좌번호를 입력해주세요");
                String accountNumber2 = sc.nextLine();
                System.out.println("송금금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba1 = map.get(accountNumber1);
                BankAccount ba2 = map.get(accountNumber2);
                ba1.transfer(ba2, money);
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
//Account객체 : 자체ID값(자동 increment), 계좌번호, 잔액 변수로 구성
class BankAccount{
    static long static_id = 0L;
    private long id;
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        static_id++;
        this.id = static_id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void transfer(BankAccount yourBankacount, int money){
        if(!this.withdraw(money)){
//            void에서 return을 만나면 메서드는 강제 종료
            return;
        };
        yourBankacount.deposit(money);
    }
    public void deposit(int money){
        this.balance += money;
    }
    public boolean withdraw(int money){
        if(this.balance < money){
            System.out.println("잔액 부족입니다");
            return false;
        }else {
            this.balance -= money;
            return true;
        }
    }


    public long getId() {
        return id;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
}

