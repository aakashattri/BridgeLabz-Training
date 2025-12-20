import java.util.*;
public class GreatestFactorWhileLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();

        int grtFactor = 1;
        int counter = n - 1;

        while (counter >= 1) {
            if (n % counter == 0) {
                grtFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor " + grtFactor);
    }
}
