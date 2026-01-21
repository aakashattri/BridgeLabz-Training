
import java.io.BufferedReader;
import java.io.FileReader;

public class IntermediateFilterRecordFromCSV {
	public static void main(String[] args) {
		String filePath="src/io_progaramming_practice/csv_data_Handling/StudentRecord.csv";
		boolean found=false;
		try(BufferedReader bfr=new BufferedReader(new FileReader(filePath))){
			
			String line;
			bfr.readLine();
			while((line=bfr.readLine())!=null) {
				String[]col=line.split(",");
				int marks=Integer.parseInt(col[3].trim());				
				
				if(marks>80) {
					found=true;
					System.out.println(
							"ID: " + col[0] +
							" | Name: " + col[1] +
							" | Age: " + col[2] +
							" | Marks: " + col[3]
					);
				}
			}
			if(!found) {
				System.out.println("Didn't get any student with marks > 80");
			}
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
