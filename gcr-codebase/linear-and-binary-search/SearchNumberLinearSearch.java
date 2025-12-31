
import java.util.Scanner;

public class SearchNumberLinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[]numbers= {1,2,4,6,8,5,6,8,5,6,55,4,6,9,7,55,4,8,9,6,40};
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]==number) {
                System.out.println("Found at index: "+i);
                break;
            }
        }
    }
}