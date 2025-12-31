
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class ByteToCharStreamUsingISR {
    public static void main(String[] args)throws Exception {

        String path="src/demo.txt";

        FileInputStream fis=new FileInputStream(path);

        InputStreamReader isr=new InputStreamReader(fis);

        BufferedReader bfr=new BufferedReader(isr);

        String line;
        while ((line = bfr.readLine()) != null){
            String[] words = line.split("//s+");
            for (String word : words){
                System.out.println(word);
            }
        }



    }
}