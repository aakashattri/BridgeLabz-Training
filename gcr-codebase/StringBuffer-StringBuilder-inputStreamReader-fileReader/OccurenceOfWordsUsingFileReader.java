import java.io.BufferedReader;
import java.io.FileReader;

public class OccurenceOfWordsUsingFileReader {
    public static void main(String[] args) throws Exception{
        String path="src/demo.txt";
        String tg="is";
        int count=0;
        FileReader fr=new FileReader(path);

        BufferedReader bfr=new BufferedReader(fr);

        String line;
        while ((line = bfr.readLine()) != null){
            String[] words = line.split(" ");
            for (String word : words){
                if (word.equalsIgnoreCase(tg)){
                    count++;
                }
            }
        }

        System.out.println("The word '" + tg + "' appears " + count + " times in the file.");

    }
}