package _2025_09_06_DesignPattern._2025_09_11_01_Encapsulation;

public class Account {
    //    public float balance;
    private float balance;


    public void deposit(float amount) {
//        this.balance = this.balance +amount;
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0 && balance >= amount)
            balance -= amount;
    }

    public float getBalance() {
        return balance;
    }

/*
    public void setBalance(float balance) {
        if (balance > 0)
            this.balance = balance;
    }
*/

}
