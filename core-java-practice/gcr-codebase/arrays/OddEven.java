import java.util.*;

public class OddEven {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ;

        int number  = sc.nextInt() ;

        if(number <= 0 ){
            System.out.println("ERROR");
            return ;
        }
        int length = number / 2;

        int[] odd  = new int[number % 2 == 0 ? length : length  + 1] ;
        int[] even = new int[length];
        int indexOdd =  0 ;
        int indexEven  = 0 ;
        for(int i = 1;  i <= number ; i++){
            if( i  % 2 != 0 ){

                odd[indexOdd] = i ;
                indexOdd++;

            }
            else{
                even[indexEven] = i ;
                indexEven++;
            }
        }
        System.out.println("ODD NUMBERS ARE  : ") ;
        for(int v : odd) {
            System.out.print(v + " " ) ;
        }
        System.out.println() ;
        System.out.println("EVEN NUMBERS ARE : ") ;
        for(int v : even ){
            System.out.print(v + " ") ;
        }
        System.out.println() ;
    }

}
