import java.util.Scanner ;
public class TheCoffeeCounterChronicals {
    public static void main(String[] args){

        System.out.println("WELCOME");
        System.out.println() ;

        Scanner sc = new Scanner(System.in) ;
        int totalAmount  = 0 ;
        while(true){

            System.out.println("YOUR CURRENT TOTAL BILL IS (tax not included) : " + totalAmount) ;


            System.out.println("ENTER THE COFFEE TYPE AS NUMBER  :\n 1. Cold Coffee - Rs. 100  \n 2. Hot Coffee - Rs. 200 \n 3. Black Coffee - Rs. 300 \n 4. exit");



            int typedNumber = sc.nextInt() ;
            if(typedNumber == 4 )break ;



            System.out.println("Number of Coffee : ") ;

            int quantity = sc.nextInt() ;


            switch (typedNumber) {
                case 1:
                    totalAmount += 100 * quantity;
                    break;

                case 2:
                    totalAmount += 200 * quantity;
                    break;

                case 3:
                    totalAmount += 300 * quantity;
                    break;

                default:
                    System.out.println("YOU TYPED SOMETHING ELSE");
            }


        }

        float gstCut = totalAmount * 0.08f ;

        System.out.println(" YOUR TOTAL AMOUNT IS : "  +  ( totalAmount  + gstCut ) ) ;



    }
}
