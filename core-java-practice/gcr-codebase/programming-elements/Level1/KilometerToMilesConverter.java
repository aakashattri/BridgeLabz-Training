import java.util.*;
public class KilometerToMilesConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;
        double kilometer = input.nextDouble();
        double miles  = kilometer / 1.6 ;
        System.out.println("The total miles is " + miles + " mile for the given " + kilometer + " km ") ;


    }
}
