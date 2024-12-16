package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private int balance;

    //생성자 추가

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void updateBalance(int balance){
        this.balance = balance;
    }


    //getter 추가

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
