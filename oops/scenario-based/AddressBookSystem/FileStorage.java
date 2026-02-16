

import java.io.*;
import java.util.*;

public class FileStorage implements StorageService {

    private final String file = "contacts.txt";

    public void save(List<Contact> contacts) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for(Contact c : contacts) bw.write(c.toString()+"\n");
        bw.close();
    }

    public List<Contact> load() throws Exception {
        List<Contact> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line=br.readLine())!=null) {
            String[] p=line.split(",");
            list.add(new Contact(p[0],p[1],p[2],p[3],p[4],p[5],p[6],p[7]));
        }
        return list;
    }
}
