
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderVsInputStreamReader{
    public static void main(String[] args)throws IOException{
        String filePath="src/demo.txt";
        long startFileReader=System.nanoTime();
        readFileUsingFileReader(filePath);
        long endFileReader=System.nanoTime();
        System.out.println("FileReader Time: "+(endFileReader-startFileReader)/1000000+" ms");
        long startInputStreamReader=System.nanoTime();
        readFileUsingInputStreamReader(filePath);
        long endInputStreamReader=System.nanoTime();
        System.out.println("InputStreamReader Time: "+(endInputStreamReader-startInputStreamReader)/1000000+" ms");
    }

    private static void readFileUsingFileReader(String filePath)throws IOException{
        FileReader fileReader=new FileReader(filePath);
        int data;
        while((data=fileReader.read())!=-1){}
        fileReader.close();
    }

    private static void readFileUsingInputStreamReader(String filePath)throws IOException{
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(filePath));
        int data;
        while((data=inputStreamReader.read())!=-1){}
        inputStreamReader.close();
    }
}