
import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}