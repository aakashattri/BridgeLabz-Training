import java.util.*;
public class MultiplesBelow100ForLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int number = sc.nextInt();

        for (int i = 1; i < 100; i++) {

            if (i % number == 0)

                System.out.println(i);
        }
    }
}
