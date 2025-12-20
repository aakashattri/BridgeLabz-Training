import java.util.Scanner ;
public class MayaBMIFitnessTracker {

    public static void main(String[] args)
    {

        System.out.println("THE BMI CALCULATOR --> ") ;


        // input section

        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENTER THE HEIGHT IN METERS  : " );
        float height = sc.nextFloat();
        System.out.println("ENTER THE WEIGHT IN KILOGRAMS : ") ;
        float weight = sc.nextFloat() ;


        // BMI CALCULATE

        float bmi = weight / ( height * height) ;

        // print section based on conditionals

        if (18.5f <= bmi && bmi <= 24.9f) {
            System.out.println("Category: Normal");
        }
        else if (bmi < 18.5f) {
            System.out.println("Category: Underweight");
        }
        else {
            System.out.println("Category: Overweight");
        }
    }
}
