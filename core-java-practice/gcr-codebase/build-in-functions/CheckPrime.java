import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num =  sc.nextInt() ;
        
        if ( primeChecker(num))
        {
            System.out.println(num + "  is  a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number .");
        }
    }

    public static boolean primeChecker(int n) {
        
        if (n <= 1) 
            return  false;
        for  ( int i = 2;i <= Math.sqrt (n ) ; i++)
        {
            if (n %  i == 0)
                return  false;
        }
        return true;
    }
}