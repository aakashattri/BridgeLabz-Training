import java.util.*;
public class ManualStringLength {
    public static int getLength(String str) {
        int cnt = 0;
        try {
            while (true) {
                str.charAt ( cnt);
                cnt ++;
            }
        } catch
        (Exception e ) {
            return cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        int manualLength = getLength(str);
        
        System.out.println(manualLength);
        System.out.println(str.length());
    }
}