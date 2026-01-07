
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {
    public static void main(String[] args) {
        int count=0;
        boolean inword=false;
        try {
            FileReader fr=new FileReader("src/demo.txt");
            BufferedReader bfr=new BufferedReader(fr);

            int data;
            while((data=bfr.read())!=-1){
                if(!Character.isWhitespace(data)) {
                    inword=false;
                }else if(!inword) {
                    inword=true;
                    count++;
                }
            }
            System.out.println("Count: "+count);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}