
import java.util.regex.*;
public class ValidateLicensePlate {
    public static void main(String[] args) {
        String licensePlatet="GH3242";

        String regex="^[A-Z]{2}\\d{4}$";


        Pattern pattern=Pattern.compile(regex);

        Matcher matcher =pattern.matcher(licensePlatet);

        if(matcher.matches()) {
            System.out.println("Valid License Plate");
        }else {
            System.out.println("Invalid !");
        }
    }
}