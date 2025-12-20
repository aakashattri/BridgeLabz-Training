import java.util.Scanner;

public class HarshadNumberCheckLevel3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int org = number;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        if (org % sum == 0) {
            System.out.println(org + " is a Harshad Number");
        } else {
            System.out.println(org + " is Not a Harshad Number");
        }
    }
}
