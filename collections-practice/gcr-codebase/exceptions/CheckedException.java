
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("src/dem1.txt");

            System.out.println("File has been read successfully");
        }catch(IOException e) {
            System.out.println("File Not Found!");
        }
    }
}