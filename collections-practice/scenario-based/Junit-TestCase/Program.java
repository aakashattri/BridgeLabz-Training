@SuppressWarnings("serial")
class NegativeAmountException extends Exception{
    public NegativeAmountException(String message) {
        super(message);
    }
}
@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class Program {
    private int balance;
    Program(int balance){
        this.balance=balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposite(int amount) throws NegativeAmountException {
        if(amount<0) {
            throw new NegativeAmountException("Deposited amount cannot be Negative!");
        }else {

            balance+=amount;
        }
    }
    public void withdraw(int amount) throws InsufficientBalanceException{
        if(amount>balance) {
            throw new InsufficientBalanceException("Insufficient Funds!");

        }else {
            balance-=amount;
        }
    }
}