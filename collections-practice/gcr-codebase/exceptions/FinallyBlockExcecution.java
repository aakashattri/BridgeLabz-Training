
import java.util.Scanner;

public class FinallyBlockExcecution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        try {
            System.out.println("divide num1 by num2: " +num1/num2);
            System.out.println("divide num1 by Zero:" +num1/0);

        }catch(ArithmeticException e) {
            System.out.println("Number should not be divided by zero....");
        }finally {
            System.out.println("Operation Completed");
        }
    }
}