import java.util.*;

public class GenerateOTP {
    public static int generator( )
    {

        return 100000 + (int) ( Math.random() * 900000 );

    }
    public static boolean unique(int[] arr) {

        Set<Integer> set = new HashSet<Integer>( );

        for ( int x : arr ) {


            set.add( x);
        }
            return set.size() == arr. length;

    }

    public static void main( String args[]) {
        int[] otps = new int[10  ];

        for (int i = 0; i < 10; i++) otps[i] = generator();

        System.out.println(" generated : " + Arrays.toString(otps) );
        System.out.println(" All unique : " + unique(otps) );
    }
}