import java.util.Scanner;

public class GradeCalculatorLevel3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();

        double chemistry = sc.nextDouble();

        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;


        System.out.println(average) ;

        if (average >= 80) {
            System.out.println("Grade : A") ;
            System.out.println("Level 4, above agency-normalized standards");
        } else if (average >= 70) {
            System.out.println("Grade : B") ;
            System.out.println("Level 3, at agency-normalized standards");
        } else if (average >= 60) {
            System.out.println("Grade : C") ;
            System.out.println("Level 2, below, but approaching agency-normalized standards") ;
        } else if (average >= 50) {
            System.out.println("Grade : D") ;
            System.out.println("Level 1, well below agency-normalized standards") ;
        } else if (average >= 40) {
            System.out.println("Grade : E") ;
            System.out.println("Level 1-, too below agency-normalized standards");

        } else {
            System.out.println("Grade : R") ;
            System.out.println("Remedial standards") ;
        }
    }
}
