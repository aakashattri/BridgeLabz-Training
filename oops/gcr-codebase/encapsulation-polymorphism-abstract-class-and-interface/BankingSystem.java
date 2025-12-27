
interface Loanable{
    void applyForLoan();
    double calculateLoanEligibility();
}
abstract class BankAccount{
    private long accountNumber;
    private String holderName;
    private double balance;
    BankAccount(long acc,String name,double balance){
        this.accountNumber=acc;
        this.holderName=name;
        this.balance=balance;
    }
    public double getBalance(){return balance;}
    void deposit(double amt){
        balance=balance+amt;
    }
    void withdraw(double amt){
        balance= balance-amt;
    }
    abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(long a,String n,double b){
        super(a,n,b);
    }
    double calculateInterest(){
        return getBalance()*0.04;
    }
    public void applyForLoan(){}
    public double calculateLoanEligibility(){
        return getBalance()*2;
    }
}
class CurrentAccount extends BankAccount{
    CurrentAccount(long a,String n,double b){
        super(a,n,b);
    }
    double calculateInterest(){
        return getBalance()*0.02;
    }
}
public class BankingSystem{
    public static void main(String[] args){
        BankAccount b=new SavingsAccount(1,"Anurag",50000);
        System.out.println(b.calculateInterest());
    }
}