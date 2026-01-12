
import java.util.regex.*;

public class validateCreditCardNumber {
    public static void main(String[] args) {
        String CardNumber="5123456789012345";
        String regex1="^4\\d{14}$";
        String regex2="^5[1-5]\\d{14}$";

        Pattern pattern1 =Pattern.compile(regex1);
        Pattern pattern2 =Pattern.compile(regex2);

        Matcher matcher1=pattern1.matcher(CardNumber);
        Matcher matcher2=pattern2.matcher(CardNumber);

        if(matcher1.matches()) {
            System.out.println("Visa Card");
        }else if(matcher2.matches()) {
            System.out.println("Master Card");
        }else {
            System.out.println("Not a Valid Card");
        }

    }
}