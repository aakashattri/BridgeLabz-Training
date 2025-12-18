import java.util.*;

public class PrimeFactorisation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 2 ;
        while( n != 1 ){
            if( n % k != 0){
                k++;
            }
            else{
                System.out.println(k);
                n = n / k;
            }
        }
    }
}
