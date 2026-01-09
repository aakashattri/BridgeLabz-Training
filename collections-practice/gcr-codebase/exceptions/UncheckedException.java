
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println(num2/num1);
            System.out.println(num1/0);
        } catch (InputMismatchException e) {
            // TODO Auto-generated catch block
            System.out.println("Invalid Input!...");
        }catch(ArithmeticException e) {
            System.out.println("Arithmatic Error");
        }

    }
}