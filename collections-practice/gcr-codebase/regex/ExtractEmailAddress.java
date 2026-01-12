
import java.util.regex.*;

public class ExtractEmailAddress {
    public static void main(String[] args) {
        String text="Contact us at support@gmail.com and infoCompany@gla.com";
        String[]arr=text.split("\\s+");
        String regex="^[a-zA-Z0-9+_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern=Pattern.compile(regex);
        boolean found=false;
        for(String str:arr) {
            Matcher matcher=pattern.matcher(str);
            if(matcher.matches()) {
                System.out.println("Email: "+str );
                found=true;
            }
        }
        if(!found) {
            System.err.println("Didn't found any mail");
        }


    }
}