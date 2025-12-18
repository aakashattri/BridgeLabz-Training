
import java.util.Scanner;
public class FeetToYardMiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        float distance = sc.nextFloat();

        System.out.println("Your Height in cm is "+ distance * 12 * 2.54 +" while in Feet is "+ distance + " and in inches is "+ distance * 12 );


    }

}