public class NullPointer {


    public static void Handler() {

        try {

            String text = null;

            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        Handler();
    }
}