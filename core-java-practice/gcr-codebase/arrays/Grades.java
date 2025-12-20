import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int  n =  sc. nextInt();

        double[] physics  = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percent = new double[n];
        String[] grade =   new String[n];

        for (int i = 0; i < n; i++) {

            physics[i] = sc.nextDouble();

            chemistry[i] = sc.nextDouble();
            maths[i] = sc.  nextDouble();


            percent[i] = (physics[i] + chemistry[i] + maths[i]) /  3.0;

            if (percent[i] >= 80)
                grade[i] = "A";
            else if (percent[i] >= 70)
                grade[i] = "B";
            else if (percent[i] >= 60)
                grade[i] = "C";
            else if (percent[i] >= 50)
                grade[i] = "D";
            else if (percent[i] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student : "  + ( i + 1 ) + " , physics : " + physics[i]  + " , chemistry : " + chemistry[i] + " ,maths  : " + maths[i] + " , percentage: "+ percent[i] + " , grades : " + grade[i]) ;
        }
    }
}