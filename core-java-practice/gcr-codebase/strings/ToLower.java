import java.util.Scanner;

public class ToLower {
    public static String lower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text. charAt(i);
            if (ch >= 'A' && ch <= 'Z' ) {
                result += (char) ( ch + 32 );
            } else {
                result +=   ch;
            }
        }
        return result;
    }

    public static boolean charAtCompare(String s1, String s2) {
        if (s1.length() !=  s2.length()) return false;
        for (int i = 0; i  < s1.length(); i++) {
            if (s1.charAt (i) != s2.charAt(i)) return false;
        }
        return
                true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String userLower = lower(text);
        String builtInLower = text.toLowerCase();

        System.out.println("lowercase: " + userLower);
        System.out.println(" By using direct methode-> lowercase: " + builtInLower);
        System.out.println(  charAtCompare(userLower, builtInLower));
    }
}