package C02ClassBasic;

import java.util.Map;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class C0206ClassPractice {
    public static void main(String[] args) {
        //Account를 담을 자료 구조로서 List 사용
        List<Account> accounts = new ArrayList<>();
        Account a1 = new Account("111111", 100000);
        Account a2 = new Account("222222", 100000);
        accounts.add(a1);
        accounts.add(a2);
        //계좌번호 목록조회
        for(Account a : accounts){
            System.out.println(a.getAcNumber());
        }
        //사용자1이 사용자2에게 돈을 보내는 상황: 계좌번호를 알고 있는 상황.
        for(Account a : accounts){
            if(a.getAcNumber().equals("111111")){
                a.setBalance(a.getBalance()-50000);
            }
            if(a.getAcNumber().equals("222222")){
                a.setBalance(a.getBalance()+50000);
            }
        }
        //계좌번호와 잔고조회
        for(Account a : accounts){
            System.out.println("계좌번호는 " + a.getAcNumber() + "잔고는 " + a.getBalance());
        }

        //Map을 자료구조로 사용시
        Map<String, Account> map = new HashMap<>();
        map.put("1234", new Account("1234", 100000));
        map.put("4321", new Account("4321", 100000));

        Account myAccount = map.get("1234");
        Account yourAccount = map.get("4321");
        myAccount.setBalance(myAccount.getBalance()-50000);
        yourAccount.setBalance(yourAccount.getBalance()+50000);
    }
}
class Account{
    private String acNumber;
    private int balance;

    public Account(String acNumber, int balance) {
        this.acNumber = acNumber;
        this.balance = balance;
    }

    public String getAcNumber() {
        return acNumber;
    }

    public int getBalance() {
        return balance;
    }

    //set balance
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
