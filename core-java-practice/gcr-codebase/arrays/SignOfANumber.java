import java.util.*;
public class SignOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int[] array = new int[5] ;

        for(int i = 0;   i < 5 ; i++){
            array[i] = sc.nextInt();

        }

        for(int v : array)
        {
            if(v < 0 ){
                System.out.println("Negative" );
            }
            else if( v == 0 ){
                System.out.println("Zero");
            }
            else{

                System.out.println("Positive and ");

                if(v % 2 == 0 ){
                    System.out.println("EVEN");
                }
                else{
                    System.out.println("ODD");
                }
            }

        }
        if(array[0] == array[4])System.out.println("Both are Equal") ;
        else if(array[0] > array[4])System.out.println("Last Element is Lesser than the first");
        else System.out.println("Last Element is greater than the First") ;
    }
}

