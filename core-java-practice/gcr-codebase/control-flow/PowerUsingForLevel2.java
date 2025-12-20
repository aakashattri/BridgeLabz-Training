import java.util.*;
public class PowerUsingForLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numb = sc.nextInt();

        int pow = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= pow; i++) {
            result *= numb;
        }

        System.out.println("Result: " + result);
    }
}
