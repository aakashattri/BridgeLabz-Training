import java.util.* ;
public class KilometerToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int kilometer=   sc.nextInt() ;
        float miles = kilometer * 0.621371f ;
        System.out.println(miles);
    }
}
