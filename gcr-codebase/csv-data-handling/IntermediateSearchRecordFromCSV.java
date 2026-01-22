
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class IntermediateSearchRecordFromCSV {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name - ");
		String name=sc.next();
		String filePath="gcr-codebase/csv-data-handling/BasicCSVProblemOutput.csv";
		boolean found=false;
		try(BufferedReader bfr=new BufferedReader(new FileReader(filePath))){
			String line;
			bfr.readLine();
			
			while((line=bfr.readLine())!=null) {
				String[]col=line.split(",");
				
				if(col[1].equalsIgnoreCase(name)){
					System.out.println(
							"ID: "+col[0]
							+"| Name: "+col[1]
							+"| Departmemt: "+col[2]
							+"| Salary: "+col[3]
					);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
