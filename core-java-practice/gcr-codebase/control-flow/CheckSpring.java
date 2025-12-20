import java.util.*;
public class CheckSpring {
    static void check(int month, int day) {
        if ( (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)  ){
            System.out.println("Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
    public static void main(String[] args) {

        Scanner  sc =  new Scanner(System.in) ;
        int month = sc.nextInt() ;
        int day = sc.nextInt() ;
        check(month, day);
    }
}
