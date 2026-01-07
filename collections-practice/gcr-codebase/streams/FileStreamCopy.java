
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("src/demo.txt");
            FileOutputStream fos=new FileOutputStream("output.txt");

            int data;
            while((data=fis.read())!=-1) {
                fos.write(data);
            }
            System.out.println("File Copied Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}