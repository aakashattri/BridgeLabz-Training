import java.util.*;

public class FriendAnalyzer {


    public static int findingyoungest(int[] ages) {
        int min = 0;

        for ( int i  = 1; i < ages. length; i++ ) {

            if (ages[i] < ages[min] ) {
                min = i;
             }
        }

        return min;
    }

    public static int tallestFind(double[] heights) {

        int max = 0;
        for (int i = 1; i < heights.length ; i++) {

            if (heights[i] > heights[max]) {
                max = i;
                }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];

        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {

            ages[i] = sc.nextInt();

            heights[i] = sc.nextDouble();
        }

        int youngest = findingyoungest(ages);
        int tallest = tallestFind(heights);

        System.out.println("Youngest is: " + names[youngest]);

        System.out.println("Tallest is : " + names[tallest]);
    }
}