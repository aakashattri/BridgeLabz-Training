
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int[]arr=null;
        System.out.println("Enter a Index: ");
        int index=sc.nextInt();
        try {
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Not valid");
        }catch(NullPointerException e) {
            System.out.println("Array is Empty");
        }
    }
}