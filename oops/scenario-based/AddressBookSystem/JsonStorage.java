
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JsonStorage implements StorageService {

    private final String file = "contacts.json";
    @Override
    public void save(List<Contact> contacts) throws Exception {

        JSONArray array = new JSONArray();

        for (Contact c : contacts) {

            JSONObject obj = new JSONObject();
            obj.put("firstName", c.firstName);
            obj.put("lastName", c.lastName);
            obj.put("address", c.address);
            obj.put("city", c.city);
            obj.put("state", c.state);
            obj.put("zip", c.zip);
            obj.put("phone", c.phone);
            obj.put("email", c.email);

            array.put(obj);
        }

        FileWriter writer = new FileWriter(file);
        writer.write(array.toString(4));
        writer.close();

        System.out.println("Saved to JSON Successfully!");
    }
    @Override
    public List<Contact> load() throws Exception {

        List<Contact> list = new ArrayList<>();

        String content = new String(Files.readAllBytes(Paths.get(file)));

        if(content.isEmpty())
            return list;

        JSONArray array = new JSONArray(content);

        for (int i = 0; i < array.length(); i++) {

            JSONObject obj = array.getJSONObject(i);

            Contact c = new Contact(
                    obj.getString("firstName"),
                    obj.getString("lastName"),
                    obj.getString("address"),
                    obj.getString("city"),
                    obj.getString("state"),
                    obj.getString("zip"),
                    obj.getString("phone"),
                    obj.getString("email")
            );

            list.add(c);
        }

        System.out.println("Loaded from JSON Successfully!");
        return list;
    }
}
