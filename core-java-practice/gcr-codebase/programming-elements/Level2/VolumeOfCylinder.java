import java.util.Scanner ;
public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt() ;
        int height  = sc.nextInt() ;
        float volume = (radius * radius) * height * 22/7.0f ;
        System.out.println(volume) ;
    }

}
