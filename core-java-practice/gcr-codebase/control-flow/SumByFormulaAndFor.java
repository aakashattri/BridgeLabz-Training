import java.util.Scanner;

public class SumByFormulaAndFor {

    static void computeSum(int n) {

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + loopSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (loopSum == formulaSum) {
            System.out.println("Both results are correct and matched");
        } else {
            System.out.println("Results do not match");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        computeSum(number);
    }
}
