import java.util.Scanner;

public class IllegalArgument {
    public static void generator(String text, int start, int end) {
        System.out.println(text.substring(start, end));
    }

    public static void handler(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException |  StringIndexOutOfBoundsException e) {
            System.out.println(" Exception :  " +  e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int start = sc.nextInt();

        int end = sc.  nextInt();
        handler(text, end, start);
    }
}