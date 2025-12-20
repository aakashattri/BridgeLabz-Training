import java.util.Scanner;

public class LargestTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[]  digits = new int[10];
        int index   = 0;

        while (number != 0   && index < 10) {
            digits[index++] = number % 10;
            number =number /  10;
        }

        int maxFirst = -1, secondMax = -1;

        for (int i = 0; i < index; i++) {
            if (  digits[i] >   maxFirst) {
                secondMax = maxFirst;
                maxFirst =   digits[i];
            } else if (digits[i] > secondMax && digits[i] !=   maxFirst) {
                secondMax   = digits[i];
            }
        }

        System.out.println("Largest digit:  " + maxFirst     );
        System.out.println("Second largest digit:  " +  secondMax);
    }
}