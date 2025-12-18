import java.util.Scanner;

public class DigitCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig = 0;
        while (n != 0) {
            dig++;
            n = n / 10;
        }
        System.out.println(dig);
    }
}
