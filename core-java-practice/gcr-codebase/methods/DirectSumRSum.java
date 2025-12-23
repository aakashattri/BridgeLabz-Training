import java.util.* ;
public class DirectSumRSum {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        int  n =  sc.nextInt()  ;


        if (n > 0) {
            System.out.println("recursive sum : "  + rSum(n));

            System.out.println("Direct sum  " + sumFormula(n) );

        }
        else {

            System.out.println("enter natural number");
        }
    }

    public static int rSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + rSum(n - 1);
    }


    public static float sumFormula(int n) {

        return n * (n + 1) / 2.0f;
    }
}