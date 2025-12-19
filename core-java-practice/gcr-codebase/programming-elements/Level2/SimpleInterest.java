import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int principal = sc.nextInt() ;
        int rate = sc.nextInt() ;
        int time = sc.nextInt() ;
        float simpleInterest = principal * time * rate / 100.0f;
        System.out.println(simpleInterest) ;
    }

}
