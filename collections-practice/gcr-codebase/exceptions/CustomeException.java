
import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
public class CustomeException {
    public void validateAge(int age)throws InvalidAgeException{
        if(age>=18) {
            System.out.println("Access Granted");
        }else {
            throw new InvalidAgeException("Unauthorized");
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
        CustomeException exception=new CustomeException();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        try {
            exception.validateAge(age);
        }catch(InvalidAgeException e) {
            System.out.println("Access Not Allowed");
        }

    }
}