import java.util.*;
public class Multiplication {
    static void printTable(int number) {
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
         printTable(n);
    }
}
