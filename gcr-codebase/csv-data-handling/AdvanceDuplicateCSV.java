
import java.io.*;
import java.util.*;

public class AdvanceDuplicateCSV {
    public static void main(String[] args) throws Exception {

        Set<String> seenIds=new HashSet<>();
        BufferedReader br=new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        String line;
        while((line=br.readLine())!=null){
            String[] data=line.split(",");
            if(!seenIds.add(data[0])){
                System.out.println("Duplicate record: "+line);
            }
        }

        br.close();
    }
}

