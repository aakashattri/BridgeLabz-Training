public class PowerUsingWhileLevel2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int num = sc.nextInt();

        int pow = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < pow) {
            result *= num;
            counter++;
        }

        System.out.println("Result: " + result);
    }
}
