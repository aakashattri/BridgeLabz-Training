import java.util.Scanner;

public class ArmstrongNumberCheckLevel3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num, sum = 0;
        while (num> 0) {

            int digit = num % 10;

            sum += digit * digit * digit;

            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is Not an Armstrong Number");
        }
    }
}
