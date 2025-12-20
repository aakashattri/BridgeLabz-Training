import java.util.* ;
public class HeightMean {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double[]  height = new double[11] ;

        double sum = 0 ;

        for(int i = 0;  i < 11; i++){

            height[i] = sc.nextDouble()  ;
            sum += height[i] ;

        }

        double  mean  =  sum / 11.0f ;
        System.out.println("Mean Height : "  + mean) ;

    }
}
