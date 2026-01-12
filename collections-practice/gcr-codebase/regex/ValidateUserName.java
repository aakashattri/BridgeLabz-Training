import java.util.Scanner;
import java.util.regex.*;
public class ValidateUserName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String regex="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(str);

        if(matcher.matches()) {
            System.out.println(str+" is valid");
        }
        else {
            System.out.println("Invalid");
        }

    }

}