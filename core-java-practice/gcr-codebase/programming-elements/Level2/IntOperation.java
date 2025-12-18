import java.util.*;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();

        int b=sc.nextInt();


        int c=sc.nextInt();

        int answer1=a+b*c;

        int answer2=a*b+c;

        int answer3=c+a/b;

        int answer4=a%b+c;

        System.out.println("The results of IntOperations are " +answer1+", "+ answer2+", "+ answer3+" and " +answer4);

    }
}