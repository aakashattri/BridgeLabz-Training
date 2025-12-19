import java.util.Scanner ;
public class CelsiusToFahrenheit {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ;
        float celsius = sc.nextFloat() ;
        float fahrenheit = ( celsius * 9 / 5.0f ) + 32 ;
        System.out.println(fahrenheit) ;

    }

}
