
public class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addmoney(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        if (balance < money) {
            throw new IllegalArgumentException("Not enough Balance");
        }
        balance -= money;
    }
}