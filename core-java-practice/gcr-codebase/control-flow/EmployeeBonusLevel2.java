import java.util.*;
public class EmployeeBonusLevel2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        int years = sc.nextInt();

        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println(bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years.");
        }
    }
}
