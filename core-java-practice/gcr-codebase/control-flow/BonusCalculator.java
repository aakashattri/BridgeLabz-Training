import java.util.*;
public class BonusCalculator {
    static void calculateBonus(double salary, int years) {
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println( bonus);
        } else {
            System.out.println("No bonus applicable");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        calculateBonus(n , 6);
    }
}
