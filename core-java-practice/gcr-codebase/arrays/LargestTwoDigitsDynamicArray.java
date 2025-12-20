import java.util.Scanner;

public class LargestTwoDigitsDynamicArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int mxSize = 10;
        int[] digits = new int[mxSize];
        int indx = 0;

        while (num != 0) {

            if (indx == mxSize) {
                mxSize += 10;
                int[] temp = new int[mxSize];

                for (int i = 0; i < digits. length; i++) {
                    temp[i] = digits [i];
                }

                digits = temp;
            }

            digits[indx++] = num % 10;
            num = num /  10;
        }

        int max  = -1;
        int secondMax =  -1;

        for (int i = 0; i < indx;  i++) {
            if (digits[i] > max) {
                secondMax  = max;
                max = digits[i];
            } else if (digits[i] > secondMax &&  digits[i] != max) {
                secondMax = digits[i];
            }
        }

        System.out.println("Largest digit:  " + max);
        System.out.println("Second largest digit: " + secondMax);
    }
}
