
import java.util.Scanner;

public class FindWordUsingLinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter your word");
        Scanner sc=new Scanner(System.in);
        String[]sentences= {
                "Hi my name is anurag",
                "i am aakash attri"
        };
        String word=sc.next();

        for(String sentence:sentences) {
            if(sentence.contains(word)){
                System.out.println(sentence);
            }else {
                System.out.println("Not found in :"+sentence+".");
            }
        }
    }
}