
class BankAccount{
    long accountNumber;
    double balance;

    BankAccount(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void displayAccountType(){
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;

    SavingsAccount(long accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }

    public void displayAccountType(){
        System.out.println("Account Type: Savings Account");
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
        System.out.println("Interest Rate:"+interestRate);
    }
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;

    CheckingAccount(long accountNumber,double balance,double withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }

    public void displayAccountType(){
        System.out.println("Account Type: Checking Account");
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
        System.out.println("Withdrawal Limit:"+withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{

    FixedDepositAccount(long accountNumber,double balance){
        super(accountNumber,balance);
    }
    public void displayAccountType(){
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
    }
}
public class BankAccountTypeHierarchical{
    public static void main(String[] args){

        SavingsAccount sa=new SavingsAccount(10101,50000,4.5);
        CheckingAccount ca=new CheckingAccount(20202,30000,10000);
        FixedDepositAccount fa=new FixedDepositAccount(30303,100000);

        sa.displayAccountType();
        ca.displayAccountType();
        fa.displayAccountType();
    }
}