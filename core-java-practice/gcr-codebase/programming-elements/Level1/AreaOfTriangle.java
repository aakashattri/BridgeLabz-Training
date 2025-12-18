import java.util.Scanner;
public class AreaOfTriangle {
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in);

        int height=input.nextInt();

        int base=input.nextInt();

        System.out.println("Your Area of Triangle is: " + (base * height * 0.5f));
    }
}