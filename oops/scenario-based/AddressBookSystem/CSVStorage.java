

import com.opencsv.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class CSVStorage implements StorageService {

    private final String file="contacts.csv";

    public void save(List<Contact> contacts) throws Exception {
        CSVWriter writer=new CSVWriter(new FileWriter(file));
        for(Contact c:contacts)
            writer.writeNext(new String[]{c.firstName,c.lastName,c.address,c.city,c.state,c.zip,c.phone,c.email});
        writer.close();
    }

    public List<Contact> load() throws Exception {
        List<Contact> list=new ArrayList<>();
        CSVReader reader=new CSVReader(new FileReader(file));
        String[] row;
        while((row=reader.readNext())!=null)
            list.add(new Contact(row[0],row[1],row[2],row[3],row[4],row[5],row[6],row[7]));
        reader.close();
        return list;
    }
}
