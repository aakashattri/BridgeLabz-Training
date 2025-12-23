import java.util.Scanner;

public class MinMaxOfThree {
    public static int[] getResult(int num1, int b, int c) {
        
        int min = Math.min(num1,  Math.min (b, c));
        
        int max = Math.max(num1,  Math.max(b,  c));
        
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        

        int[] result = getResult(a, b  , c);
        System.out.println("Smallest: " + result[0]  + "   , Largest: " + result[1]);
    }
}