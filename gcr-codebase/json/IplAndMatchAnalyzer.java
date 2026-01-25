
import java.io.*;

import tools.jackson.databind.*;
import tools.jackson.databind.node.ObjectNode;

public class IplAndMatchAnalyzer {
	public void csvAnalyzer(String filePath) {
		String fileDestination="src/io_progaramming_practice/json/CsvSanitizedIplData.csv";
		try(BufferedReader bfr =new BufferedReader(new FileReader(filePath));
			BufferedWriter bfw=new BufferedWriter(new FileWriter(fileDestination))){
			String line;
			bfr.readLine();
			bfw.write("match_id,team1,team2,score_team1,score_team2,winner,player_of_match");
			bfw.newLine();
			while((line=bfr.readLine())!=null) {
				String[]data=line.split(",");
				String[]team1=data[1].split(" ");
				String[]team2=data[2].split(" ");
				String[]player=data[6].split(" ");
				for(int i=1;i<team1.length;i++) {
					team1[i]="***";
				}
				data[1]=String.join(" ",team1);
				for(int i=1;i<team2.length;i++) {
					team2[i]="***";
				}
				data[2]=String.join(" ",team2);
				for(int i=1;i<player.length;i++) {
					player[i]="***";
				}
				data[6]=String.join(" ", player);
				bfw.write(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+data[5]+","+data[6]);
				bfw.newLine();
			}
			System.out.println("Data is Sanitized Successfully");
		}catch(Exception e ) {
			System.out.println("Some Error Occured!"+ e.getMessage());
		}
		
	}
	public void jsonAnalyzer(String filePath) {
		String fileDestination="src/io_progaramming_practice/json/JsonSanitizedIplData.json";		
		ObjectMapper objectMapper=new ObjectMapper();	
		
		try {
			JsonNode root=objectMapper.readTree(new File(filePath));
			if(root.isArray()) {
				for(JsonNode match:root) {
					String team1=match.get("team1").asText();
					String[]arr1=team1.split(" ");
					for(int i=1;i<arr1.length;i++) {
						arr1[i]="***";
					}
					 ((ObjectNode) match).put("team1", String.join(" ", arr1));
					 
					 
					String team2=match.get("team2").asText();
					String[]arr2=team2.split(" ");
					for(int i=1;i<arr2.length;i++) {
						arr2[i]="***";
					}
					 ((ObjectNode) match).put("team2", String.join(" ", arr2));
					 
					 
					String player=match.get("player_of_match").asText();
					String[]arr3=player.split(" ");
					for(int i=1;i<arr3.length;i++) {
						arr3[i]="***";
					}
					 ((ObjectNode) match).put("player_of_match", String.join(" ", arr3));
					
				}
			}
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileDestination), root);
			System.out.println("JSON Data Sanitized Successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
 	public static void main(String[] args) {
 		IplAndMatchAnalyzer iplAnalyzer=new IplAndMatchAnalyzer();
 				
		String csvFilePath="src/io_progaramming_practice/json/SampleIplData.csv";
		String jsonFilePath="src/io_progaramming_practice/json/SampleIplData.json";
		iplAnalyzer.csvAnalyzer(csvFilePath);
		iplAnalyzer.jsonAnalyzer(jsonFilePath);
		
	}
}
