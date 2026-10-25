package BankAccount;

public class Bank_main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("123-456","김철수",10000);
        b1.desposit(5000);
        b1.withdraw(3000);
        b1.withdraw(20000);
        b1.desposit(-1000);
        b1.printInfo();
    }
}
