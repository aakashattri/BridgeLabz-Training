
import java.lang.reflect.*;

class Bank {
    private int accountNumber;
    private double balance;

    Bank(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double addMoney(double money) {
        return balance += money;
    }

    void withdrawMoney(double money) {
        if (balance < money)
            System.out.println("Insufficient Funds");
        else
            balance -= money;
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class GetClassInfo {
    public static void main(String[] args) throws Exception {

        Bank bank=new Bank(45678,2000.0);
        Class<?> infoClass=bank.getClass();

        // 🔹 Fields
        System.out.println("------------Fields-------------");
        Field[] bankFields=infoClass.getDeclaredFields();
        for(Field fields:bankFields) {
            System.out.println(fields.getName());
        }
        // 🔹 Method
        System.out.println("------------Methods-------------");
        Method[] bankMethods=infoClass.getDeclaredMethods();
        for(Method methods:bankMethods) {
            System.out.println(methods.getName());
        }
        // 🔹 Constructor
        System.out.println("------------Constructors-------------");
        Constructor<?>[] bankConstructor=infoClass.getDeclaredConstructors();
        for(Constructor constr:bankConstructor){
            System.out.println(constr.getName());
        }
    }
}