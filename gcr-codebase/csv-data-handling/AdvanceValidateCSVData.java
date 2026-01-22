
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.*;

public class AdvanceValidateCSVData {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Info as: name,email,phoneNumber");
        String input=sc.nextLine();
        String[] data=input.split(",");
        if(data.length!=3){
            System.out.println("Invalid input format!");
            return;
        }
        String filePath="gcr-codebase/csv-data-handling/AdvanceValidateCSVDataOutputFile.csv";
        try(BufferedWriter bfw=new BufferedWriter(new FileWriter(filePath,true))){
            bfw.write("Name,Email,PhoneNumber");
            bfw.newLine();
            String emailRegex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
            Pattern emailPattern=Pattern.compile(emailRegex);
            Matcher emailMatcher=emailPattern.matcher(data[1].trim());
            String phoneRegex="^\\+91[6-9]\\d{9}$";
            Pattern phonePattern=Pattern.compile(phoneRegex);
            Matcher phoneMatcher=phonePattern.matcher(data[2].trim());
            if(emailMatcher.matches()&&phoneMatcher.matches()){
                bfw.write(data[0].trim()+","+data[1].trim()+","+data[2].trim());
                bfw.newLine();
                System.out.println("Data validated & saved successfully");
            }else{
                System.out.println("Invalid Email or Phone Number");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
