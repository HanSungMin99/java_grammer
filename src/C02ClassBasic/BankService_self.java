import java.util.*;

public class BankService_self{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        while (true) {
            System.out.println("서비스 번호를 입력하세요: 1.개설, 2.조회, 3.입금, 4.출금, 5.송금, 6.종료");
            int number = sc.nextInt();

            if (number == 1) { // 1.개설: 계좌번호와 현재가지고 계신 돈을 입력하세요.
                System.out.println("계좌번호를 입력하세요:");
                String acNumber = sc.next();
                System.out.println("초기 잔액을 입력하세요:");
                int balance = sc.nextInt();
                accounts.add(new Account(acNumber, balance));
                System.out.println("계좌가 개설되었습니다.");
            } else if (number == 2) { //2.조회: 계좌조회서비스입니다. 계좌번호 입력해주세요 → 잔고출력
                System.out.println("계좌조회서비스입니다. 조회할 계좌번호를 입력하세요:");
                String acNumber = sc.next();
                Account account = findAccount(accounts, acNumber);
                if (account != null) {
                    System.out.println("잔액: " + account.getBalance());
                } else {
                    System.out.println("계좌를 찾을 수 없습니다.");
                }
            } else if (number == 3) { //3.입금: 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요
                System.out.println("계좌입금서비스입니다. 입금할 계좌번호를 입력하세요:");
                String acNumber = sc.next();
                System.out.println("입금할 금액을 입력하세요:");
                int amount = sc.nextInt();
                Account account = findAccount(accounts, acNumber);
                if (account != null) {
                    account.deposit(amount);
                    System.out.println("입금이 완료되었습니다. 현재 잔액: " + account.getBalance());
                } else {
                    System.out.println("계좌를 찾을 수 없습니다.");
                }
            } else if (number == 4) { //4.출금: 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요
                System.out.println("계좌출금서비스입니다. 출금할 계좌번호를 입력하세요:");
                String acNumber = sc.next();
                System.out.println("출금할 금액을 입력하세요:");
                int amount = sc.nextInt();
                Account account = findAccount(accounts, acNumber);
                if (account != null) {
                    if (account.withdraw(amount)) {
                        System.out.println("출금이 완료되었습니다. 현재 잔액: " + account.getBalance());
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                } else {
                    System.out.println("계좌를 찾을 수 없습니다.");
                }
            } else if (number == 5) { //5.송금: 계좌송금서비스입니다. user1과 user2의 계좌번호와 송금금액을 입력해주세요
                System.out.println("계좌송금서비스입니다. 송금할 계좌번호를 입력하세요:");
                String fromAccountNum = sc.next();
                System.out.println("송금받을 계좌번호를 입력하세요:");
                String toAccountNum = sc.next();
                System.out.println("송금할 금액을 입력하세요:");
                int amount = sc.nextInt();
                Account fromAccount = findAccount(accounts, fromAccountNum);
                Account toAccount = findAccount(accounts, toAccountNum);
                if (fromAccount != null && toAccount != null) {
                    if (fromAccount.withdraw(amount)) {
                        toAccount.deposit(amount);
                        System.out.println("송금이 완료되었습니다.");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                } else {
                    System.out.println("계좌를 찾을 수 없습니다.");
                }
            } else if (number == 6) { // 종료
                System.out.println("서비스를 종료합니다.");
                break;
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
        sc.close();
    }

    private static Account findAccount(List<Account> accounts, String acNumber) {
        for (Account account : accounts) {
            if (account.getAcNumber().equals(acNumber)) {
                return account;
            }
        }
        return null;
    }
}

class Account {
    private static int idCounter = 1; // 자동 증가 ID
    private int id;
    private String acNumber;
    private int balance;

    public Account(String acNumber, int balance) {
        this.id = idCounter++;
        this.acNumber = acNumber;
        this.balance = balance;
    }

    public String getAcNumber() {
        return acNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
