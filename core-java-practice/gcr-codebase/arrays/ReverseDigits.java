import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int number = sc. nextInt();

        int tmp =  number;
        int cnt = 0;
        while (tmp != 0) {
            cnt++;
            tmp = tmp /  10;
        }

        int[] digits = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int digit : digits) {
            System.out.print(digit);
        }
    }
}