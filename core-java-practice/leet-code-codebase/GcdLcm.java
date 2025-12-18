import java.util.*;
public class GcdLcm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = n ;
        int b = m ;
        int lcm = 0;
        while(true){
            int r = a % b ;
            if( r == 0){
                lcm = b;
                break;
            }
            b = a ;
            a = r;
        }
        int gcd =  ( m * n ) / lcm;
        System.out.println(lcm);
        System.out.println(gcd);
        sc.close() ; 

    }
}
