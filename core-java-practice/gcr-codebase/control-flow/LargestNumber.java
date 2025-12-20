import java.util.*;
public class LargestNumber {
    static void checkLargest(int num1, int num2, int num3) {
        System.out.println(" num1 " + (num1 > num2 && num1 > num3));
        System.out.println(" num2 " + (num2 > num1 && num2 > num3));
        System.out.println(" num3 " + (num3 > num1 && num3 > num2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
         int n1 = sc.nextInt() ;
         int n2 = sc.nextInt() ;
         int n3 = sc.nextInt() ;
        checkLargest(n1, n2, n3);
    }
}
