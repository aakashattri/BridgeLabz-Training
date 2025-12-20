import java.util.Scanner;
public class Grades2D {
    public static void main(String[] args) {
        Scanner sc = new    Scanner(System.in);
        int num    = sc.nextInt();

        double[][] marks =  new double[num][3];
        double[] percent   = new double[num];
        String[] grade = new String[num];

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < 3; j++) {

                marks[i][j] = sc.nextDouble();

                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks.");
                    j--;

                }
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90)
                grade[i] = "A";
            else if (percent[i] >= 75)
                grade[i] = "B";
            else if (percent[i] >= 60)
                grade[i] = "C";
            else if (percent[i] >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        for (int i = 0; i < num; i++) {

            System.out.println("Student : " + (i + 1 ) + " , physics : " + marks[i][0] + " , chemistry : " + marks[i][1] + " ,maths  : " + marks[i][2] + " ,percentage : " + percent[i] + " , grade : " + grade[i]) ;

        }
    }
}