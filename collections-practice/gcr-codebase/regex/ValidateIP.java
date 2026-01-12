
import java.util.regex.*;

public class ValidateIP {
    public static void main(String[] args) {
        String ip="192.54.340.23";
        String regex ="^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)"+ "(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher=pattern.matcher(ip);

        if(matcher.matches()) {
            System.out.println("Valid IP");
        }else {
            System.out.println("Invalid Ip");
        }
    }
}