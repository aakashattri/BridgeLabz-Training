import java.util.*;

public class PowerCalculation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int base = sc.nextInt() ;
        int exponent = sc.nextInt() ;
        double answer = Math.pow(base , exponent) ;
        System.out.println(answer) ;

    }

}
