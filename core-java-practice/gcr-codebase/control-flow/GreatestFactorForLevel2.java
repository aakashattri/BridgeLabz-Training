import java.util.* ;
public class GreatestFactorForLevel2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
        int number = sc.nextInt();

        int gtFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                gtFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor " + gtFactor);
    }
}
