import java.util.*;
public class RocketLaunch {
    static void  count(int counter) {
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int number  =  sc.nextInt() ;
        count(number);
    }
}
