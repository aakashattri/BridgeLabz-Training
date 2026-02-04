

import java.time.LocalDateTime;

class BankAccount{
    private double balance=10000;
    public double getBalance(){
        return balance;
    }
    public boolean withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return true;
        }
        return false;
    }
}

class Transaction implements Runnable{
    private BankAccount account;
    private String customerName;
    private double amount;
    Transaction(BankAccount account,String customerName,double amount){
        this.account=account;
        this.customerName=customerName;
        this.amount=amount;
    }
    @Override
    public void run(){

        System.out.println("["+Thread.currentThread().getName()+"] Attempting to withdraw "+amount);
        System.out.println("Thread State: "+Thread.currentThread().getState());

        boolean result=account.withdraw(amount);

        if(result){
            System.out.println("Transaction successful: "+customerName+ ", Amount: "+amount+", Time: "+LocalDateTime.now());
            System.out.println("Remaining Balance: "+account.getBalance());
        }else{
            System.out.println("Transaction failed: "+customerName+", Amount: "+amount+ ", Time: "+LocalDateTime.now());
        }
    }
}

public class BankingSystemWithMultipleTransactions{

    public static void main(String[] args){
        BankAccount account=new BankAccount();
        Thread t1=new Thread(new Transaction(account,"Customer-1",3000),"Customer-1");
        Thread t2=new Thread(new Transaction(account,"Customer-2",4000),"Customer-2");
        Thread t3=new Thread(new Transaction(account,"Customer-3",2000),"Customer-3");
        Thread t4=new Thread(new Transaction(account,"Customer-4",5000),"Customer-4");
        Thread t5=new Thread(new Transaction(account,"Customer-5",1500),"Customer-5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
