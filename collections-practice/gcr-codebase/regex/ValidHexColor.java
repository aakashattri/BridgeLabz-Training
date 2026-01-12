
import java.util.regex.*;

public class ValidHexColor {
    public static void main(String[] args) {
        String color="#Fd5490";
        String regex="^#[0-9a-fA-F]{6}";

        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(color);

        if(matcher.matches()) {
            System.out.println("Valid Color");
        }else {
            System.out.println("Invalid Color");
        }
    }
}