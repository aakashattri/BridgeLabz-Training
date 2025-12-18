import java.util.*;

public class InverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inv = 0;
        byte dig = 1;
        while( n != 0 ){
            inv +=  dig * (int) Math.pow(10, ( n % 10 ) - 1 );
            n = n / 10 ;
            dig++;
        }
        System.out.println(inv);

    }
}
