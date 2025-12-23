import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() ;
        int b = sc.nextInt( );
        int c = sc.nextInt() ;

        int max = findMax( a, b, c ) ;
        System.out.println (max);
    }

    static int findMax(int x,int y, int z)
    {
        return Math.max( x, Math.max(y, z));
    }
}