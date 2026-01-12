
import java.util.Scanner;

public class StringSentenceFormatter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String:");
        String paragraph=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        boolean capitalizeNext=true;
        for (int i =0;i<paragraph.length();i++) {
            char ch=paragraph.charAt(i);
            int ascii=ch;
            if (ch==' ' && sb.length() > 0 && sb.charAt(sb.length()- 1)== ' ') {
                continue;
            }
            if (capitalizeNext && ascii>=97&&ascii<=122) {
                ch=(char)(ascii-32);
                capitalizeNext=false;
            }

            sb.append(ch);
            if (ch=='.' || ch=='?' || ch=='!') {
                capitalizeNext=true;
                if (i+1<paragraph.length() && paragraph.charAt(i+1)!=' ') {
                    sb.append(' ');
                }
            }
        }
        System.out.println(sb.toString());
    }
}