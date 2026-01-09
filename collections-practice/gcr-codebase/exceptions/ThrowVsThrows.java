
import java.util.Calendar;
import java.util.Scanner;

public class ThrowVsThrows {
    public double calculateInterest(double amount,double rate,int year)throws IllegalArgumentException {
        if(amount>0 || rate>0) {
            throw new IllegalArgumentException("Invalid Arguments");
        }else {
            return (amount*rate*(int)year)/100;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount=sc.nextDouble();
        System.out.println("Enter by Rate : ");
        double rate=sc.nextDouble();
        System.out.println("Enter for years: ");
        int year=sc.nextInt();
        ThrowVsThrows ex=new ThrowVsThrows();
        try {
            System.out.println("Interest Amount"+ex.calculateInterest(amount, rate, year));
        }catch(IllegalArgumentException e) {
            System.out.println("Invalid input:Amount and rate should be positive.");
        }
    }
}