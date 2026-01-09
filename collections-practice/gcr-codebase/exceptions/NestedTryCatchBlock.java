
import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        int[]arr= {34,23,43,5,12,24,48,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter divisor: ");
        int divisor=sc.nextInt();
        System.out.println("Enter Index:Limit is 0 to"+(arr.length-1));
        int index=sc.nextInt();
        try {
            int el=arr[index];
            try {
                System.out.println("ans"+ el/0);
            }catch(ArithmeticException e) {
                System.out.println("Divisor is Zero!...");
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Invalid!...");
        }
    }
}