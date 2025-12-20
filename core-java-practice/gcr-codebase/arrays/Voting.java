import java.util.* ;
public class Voting {

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in) ;

        int[] ages = new int[10] ;
        for(int i = 0 ; i < 10 ; i++){

            ages[i] = sc.nextInt() ;
        }

        for(int age :  ages){
            if(age < 0 )System.out.println("INVALID AGE") ;
            else if(age >= 18 )System.out.println("This Student with age "+ age+ " can vote." ) ;
            else System.out.println("This Student with age " + age + " cannot vote.") ;
        }
    }

}
