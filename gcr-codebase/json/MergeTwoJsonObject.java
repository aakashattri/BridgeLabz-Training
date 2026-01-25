
import org.json.JSONObject;
import org.json.JSONArray;

import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class MergeTwoJsonObject {
    public static void main(String[] args) {
        try {
            JSONObject jsonObject1=new JSONObject();
            jsonObject1.put("name","Anurag");
            jsonObject1.put("age",28);
            jsonObject1.put("email","anurag@gmail.com");

            JSONObject jsonObject2=new JSONObject();
            jsonObject2.put("name","Aditya");
            jsonObject2.put("age",30);
            jsonObject2.put("email","aditya@gmail.com");
            JSONArray mergedArray=new JSONArray();
            mergedArray.put(jsonObject1);
            mergedArray.put(jsonObject2);

            ObjectMapper objectMapper=new ObjectMapper();
            objectMapper.writeValue(
                new File("src/io_progaramming_practice/json/MergeTwoJsonDataOutput.json"),
                mergedArray.toList()
            );
            System.out.println("JSON merged successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
