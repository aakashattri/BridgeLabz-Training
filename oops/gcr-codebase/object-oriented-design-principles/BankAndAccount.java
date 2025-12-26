package oops.object_modelling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
class Bank {
    private String name;
    private List<Customer>customers;
    private AtomicInteger accountNumberGenerator=new AtomicInteger(1000);

    public Bank(String name) {
        this.name=name;
        this.customers=new ArrayList<>();
    }
    public Account openAccount(Customer customer,double initialBalance) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            customer.setBank(this);
        }
        int accountNumber=accountNumberGenerator.getAndIncrement();
        Account account=new Account(accountNumber, initialBalance, this);
        customer.addAccount(account);
        System.out.println("Account "+accountNumber+" opened for "+customer.getName()+ " at " +name);
        return account;
    }

    public String getName() {
        return name;
    }
}
class Customer {
    private String name;
    private Bank bank; 
    private List<Account> accounts;

    public Customer(String name) {
        this.name=name;
        this.accounts=new ArrayList<>();
    }

    public void viewBalances(){
        System.out.println("Balances for "+name+":");
        for(Account account : accounts){
            System.out.println(" - Account "+account.getAccountNumber()+" (Bank: "+account.getBank().getName()+"): Rs"+account.getBalance());
        }
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String getName(){
        return name;
    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank(){
        return bank;
    }
}

class Account {
    private int accountNumber;
    private double balance;
    private Bank bank; 

    public Account(int accountNumber,double initialBalance, Bank bank) {
        this.accountNumber=accountNumber;
        this.balance =initialBalance;
        this.bank= bank;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public Bank getBank(){
        return bank;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposited Rs"+amount+" to account "+accountNumber);
        }
    }
    public boolean withdraw(double amount){
        if(amount>0 &&balance>=amount) {
            balance-=amount;
            System.out.println("Withdrew Rs" +amount +" from account "+accountNumber);
            return true;
        }else{
            System.out.println("Withdrawal failed for account "+accountNumber);
            return false;
        }
    }
}
public class BankAndAccount{
    public static void main(String[] args) {
        Bank bank=new Bank("First National Bank");
        Customer anurag=new Customer("Anurag");
        Customer aakash = new Customer("aakash");
        bank.openAccount(anurag, 500.0);  
        bank.openAccount(anurag, 1500.0); 
        bank.openAccount(aakash, 1000.0);   
        anurag.viewBalances();
        aakash.viewBalances();
        anurag.addAccount(new Account(9999, 0, bank));
    }
}
