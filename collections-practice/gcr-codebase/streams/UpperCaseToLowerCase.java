
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperCaseToLowerCase {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Src/demo.txt");
        FileWriter fw=new FileWriter("src/Output.txt");

        int data;
        while((data=fr.read())!=-1) {
            fw.write(Character.toUpperCase((char)data));
        }
        System.out.println("Successfully converted Upper case to lower case");


    }
}