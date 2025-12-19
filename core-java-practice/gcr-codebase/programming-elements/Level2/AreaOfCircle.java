import java.util.Scanner ;
public class AreaOfCircle {

    public static void main(String[] args){

        Scanner sc   = new Scanner(System.in) ;
        int radius = sc.nextInt() ;
        float area = ( radius * radius) * 22/7.0f ;
        System.out.println(area) ;

    }

}
