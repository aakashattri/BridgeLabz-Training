import java.util.*;


public class Multiplication {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ;

        int variable  =  sc.nextInt() ;
        int[] table = new int[10] ;


        for(int i = 0 ; i < 10 ; i++){
            table[i] = variable * ( i + 1)  ;
            System.out.println( variable  + " * " + (i  + 1 ) + " = " + table[i]) ;
        }
    }
}
