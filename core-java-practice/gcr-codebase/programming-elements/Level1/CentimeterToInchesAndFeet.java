import java.util.*;
public class CentimeterToInchesAndFeet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int height = sc.nextInt() ;
        float inches = height / 2.5f ;
        float feet = inches / 12 ;
        System.out.println("Your Height in cm is " + height  + " while in feet is "+ feet + " and inches is " + inches) ;
    }

}
