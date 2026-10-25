package BankAccount;

public class BankAccount {
    private String account_Number;
    private String owner;
    private double balance;

    public BankAccount(String account_Number, String owner, double balance) {
        this.account_Number = account_Number;
        this.owner = owner;
        this.balance = balance;
    }
    public void desposit(int amount){
        if(amount <= 0){
            System.out.println("잘못된 입력입니다.");
        }
        else{
            balance += amount;
            System.out.println(amount+"입금완료");
        }
    }
    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("잔액이 부족합니다.");
        }
        else{
            System.out.println("정상 출금");
            balance -= amount;
        }
    }
    public void printInfo(){
        System.out.println("계좌번호:"+account_Number);
        System.out.println("예금주:"+owner);
        System.out.println("잔액:"+balance);
    }
}
