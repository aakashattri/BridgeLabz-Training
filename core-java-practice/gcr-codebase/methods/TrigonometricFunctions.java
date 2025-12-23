import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculate(double angleDegree) {

        double angle = Math.toRadians(angleDegree);

        return new double[]{
                Math.sin(angle), Math.cos(angle), Math.tan(angle)

        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle =  sc.nextDouble();

        double[]  result = calculate(angle);
        System.out.println (" Sine: " + result[0] + ",Cosine: " + result[1] + ", Tangent: " + result[2]);
    }
}