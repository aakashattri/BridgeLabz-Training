
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import java.io.File;
public class ReadingJsonFile {
	public static void main(String[] args) {
		try {
			ObjectMapper objectMapper=new ObjectMapper();
			JsonNode jsonNode=objectMapper.readTree(new File("src/io_progaramming_practice/json/StudentData.json"));
			System.out.println("UserName: "+jsonNode.get("name")+"|age: "+jsonNode.get("age")+"| email: "+jsonNode.get("email"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
