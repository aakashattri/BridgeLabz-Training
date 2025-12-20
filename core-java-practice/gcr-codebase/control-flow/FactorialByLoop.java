import java.util.*;
public class FactorialByLoop {

    public static void factorial(int number){
        if(number <= 0 ){
            System.out.println("Not a natural number") ;
            return ;
        }
        int result = 1 ;
        for(int i  = 1 ; i <= number ; i++){
            result *= i ;
        }
        System.out.println(result) ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int number  =  sc.nextInt() ;
        factorial(number);

    }

}
