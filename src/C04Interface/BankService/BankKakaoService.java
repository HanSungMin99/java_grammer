package C04Interface.BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        int newBalance = ba.getBalance() + money;  // 입금 후 새로운 잔액 계산
        ba.updateBalance(newBalance);  // 잔액 업데이트
        System.out.println(money + "원 카카오페이로 입금되었습니다.");
        System.out.println("현재 잔액은 " + ba.getBalance() + "원 입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        int newBalance = ba.getBalance() - money;  // 출금 후 새로운 잔액 계산
        if (newBalance >= 0) {
            ba.updateBalance(newBalance);  // 잔액 업데이트
            System.out.println(money + "원 카카오페이로 출금되었습니다.");
            System.out.println("현재 잔액은 " + ba.getBalance() + "원 입니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }//밑에 코드가 더 있다는 가정하에는 위의 코드에 return이 있을 필요가 있다.
    //하지만 밑에 더이상 코드가 없기 때문에, 위에 코드에 꼭 return이 있지 않아도 된다.
}
