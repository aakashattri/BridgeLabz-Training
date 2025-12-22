import java.util.Scanner;

public class NumberFormat{



    public static void handler(String inp) {
        try {
            int num = Integer.parseInt(inp);
            System.out.println("Parsed number: " + num);

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException: " + e);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        handler(input);
    }
}