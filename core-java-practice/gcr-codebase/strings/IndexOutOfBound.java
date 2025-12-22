import java.util.Scanner;

public class IndexOutOfBound{


    public static void handler(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        }
        catch
        (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException : " + e );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        handler(text);
    }
}