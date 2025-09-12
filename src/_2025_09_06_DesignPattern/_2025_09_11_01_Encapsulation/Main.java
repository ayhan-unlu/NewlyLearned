package _2025_09_06_DesignPattern._2025_09_11_01_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
//        account.balance = -1; // compilation error occurs cause balance is private access modifier,
//        account.setBalance(-1);
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
}
