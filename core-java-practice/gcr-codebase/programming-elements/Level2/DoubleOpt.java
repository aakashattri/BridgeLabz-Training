
import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double a=sc.nextDouble();

        double b=sc.nextDouble();

        double c=sc.nextDouble();

        double answer1=a+b*c;

        double answer2=a*b+c;
        double answer3=c+a/b;

        double answer4=a%b+c;

        System.out.println("The results of IntOperations are " +answer1+", "+ answer2+", "+ answer3+" and " +answer4);

    }
}