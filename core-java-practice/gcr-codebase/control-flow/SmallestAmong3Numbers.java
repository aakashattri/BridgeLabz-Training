import java.util.*;
public class SmallestAmong3Numbers {
    static void checkSmallest(int num1, int num2, int num3) {
        Boolean hai=num1 < num2 && num1 < num3;
        System.out.println(hai);
    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in) ;
        int n1 = sc.nextInt() ;
        int n2 = sc.nextInt() ;
        int n3 = sc.nextInt();
        checkSmallest(n1, n2, n3);
    }
}
