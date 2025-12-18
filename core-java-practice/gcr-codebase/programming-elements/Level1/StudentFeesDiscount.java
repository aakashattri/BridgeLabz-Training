import java.util.*;

public class StudentFeesDiscount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        float fee = in.nextFloat();


        float discountPercent = in.nextFloat();

        float discount = fee * discountPercent / 100;

        float finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
