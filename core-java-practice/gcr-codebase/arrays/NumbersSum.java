import java.util.*;
public class NumbersSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );

        double[] numbers  = new double[10] ;
        double total = 0.0 ;
        int index  = 0 ;

        while(true){

            double number  =  sc.nextDouble() ;
            if(number < 0 || number == 0  || index == 10){
                break ;
            }
            numbers[index] = number ;
            index++;
        }

        for(int i = 0 ; i < index ; i++){
            total += numbers[i] ;
            System.out.println(" number at index" + ( i+ 1 ) + " : " + numbers[i]) ;
        }
        System.out.println("total sum : " + total);
    }

}
