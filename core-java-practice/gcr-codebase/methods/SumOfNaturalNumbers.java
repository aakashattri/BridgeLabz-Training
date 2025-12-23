import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int findSum(int num) {
        int sum = 0;
        for(int i = 1 ; i <= num; i++) sum += i;


        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        int number =  sc.nextInt();

        System.out.println("Sum of first:  " + number + " natural numbers is :  " + findSum(number));
    }
}