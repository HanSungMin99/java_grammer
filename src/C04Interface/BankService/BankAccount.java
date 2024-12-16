package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private int balance;

    //생성자 추가

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //잔액 업데이트
    public void updateBalance(int balance){
        this.balance = balance;
    }


    //getter 추가
    //잔액조회
    public int getBalance() {
        return balance;
    }
    //계좌번호 조회
    public String getAccountNumber() {
        return accountNumber;
    }

}
