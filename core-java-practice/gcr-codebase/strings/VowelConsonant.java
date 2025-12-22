import java.util.*;
public class VowelConsonant {
    public static boolean isVowel(char c) {

        c = (char)(c >= 'A' && c <= 'Z' ? c + 32 : c);
        return    "aeiou".indexOf(c) >=  0;
    }
    public static int[] counter(String str) {
        int v = 0, c =  0;
        for (int i = 0;     i < str.length(); i++) {
            char ch = str. charAt(i);

            if (Character.isLetter(ch)) {
                if ( isVowel(ch) )  v++;
                else c++;
            }

        }

        return new int[]{v, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] res = counter(str);
        System.out.println("Vowel cnt : " + res[0] + ", Consonant cnt : " + res[1]);
    }
}