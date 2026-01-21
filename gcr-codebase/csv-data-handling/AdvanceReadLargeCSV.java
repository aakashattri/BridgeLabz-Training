
import java.io.*;

public class AdvanceReadLargeCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new FileReader(""));
        br.readLine();
        String line;
        int count=0;
        int batchSize=100;
        while((line=br.readLine())!=null){
            count++;
            if(count%batchSize==0){
                System.out.println("Processed records: "+count);
            }
        }
        System.out.println("Total records processed: "+count);
    }
}
