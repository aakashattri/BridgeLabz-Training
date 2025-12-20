import java.util.*;
public class Factorial {
    static void factorial(int n) {
        if (n >= 0) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        } else {
            System.out.println("Not a positive integer");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n =  sc.nextInt() ;
        factorial(n);
    }
}
