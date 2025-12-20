import java.util.Scanner;

public class SumByFormulaAndWhile {

    static void computeSum(int n) {

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i;
            i++;
        }

        float formulaSum = n * (n + 1) / 2.0f;

        System.out.println("Sum using while loop: " + loopSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (loopSum == formulaSum) {
            System.out.println("Both results are correct and matched");
        } else {
            System.out.println("Results do NOT match");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        computeSum(number);
    }
}
