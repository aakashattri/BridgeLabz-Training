import java.util.*;

public class RandomStats {
    public static int[] generator(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = 1000 + (int) (Math.random() * 9000);
        }

        return arr;
    }

    public static double[] avgMinMax(int[] arr) {

        int sum = 0, min = arr[0], max = arr[0];

        for (int num :  arr) {
            sum += num;

            if (num <  min) min =  num;
            if (num > max)max = num;

        }

        return new double[] { sum / (double)   arr. length, min, max };
    }

    public static void main(String[] args) {
        int[] numbers = generator(5);
        System.out.println( Arrays.toString(numbers ) );
        double[] result = avgMinMax(numbers);
        System.out.println("Average: "  + result[0] + "  Minimum : "  + result[1]  + " Maximum : " + result[2]);
    }
}