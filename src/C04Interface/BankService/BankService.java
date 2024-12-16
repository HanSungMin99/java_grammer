package C04Interface.BankService;

public interface BankService {
    void deposit(int money, BankAccount ba); //입금
    void withdraw(int money, BankAccount ba); //출금
}
