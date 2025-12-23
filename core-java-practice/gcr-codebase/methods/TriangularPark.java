import java.util.Scanner;

public class TriangularPark {
    public static double calRound(double a, double b, double c) {

        double perimeter = a + b + c;
        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double a = sc. nextDouble();
        double  b = sc.nextDouble();

        double  c = sc.nextDouble();

        double rounds = calRound( a, b, c);

        System.out.println(" Number of rounds required: " + rounds);
    }
}