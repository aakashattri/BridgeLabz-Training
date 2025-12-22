import java.util.Scanner;

public class ToUpper {
    public static String upperManual(String text) {
        String res =   "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text .charAt(i);
            if (ch >= 'a' &&  ch <= 'z') {
                res += (char) ( ch - 32 );
            } else {
                res += ch;
            }
        }
        return res;
    }

    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i <  s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return
                true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String userUpper = upperManual(text);
        String  builtInUpper = text.toUpperCase();

        System.out.println("manual uppercase: "  + userUpper);
        System.out.println("direct uppercase: " + builtInUpper);
        System.out.println("Are both equal? :  " + compareWithCharAt(userUpper, builtInUpper));
    }
}