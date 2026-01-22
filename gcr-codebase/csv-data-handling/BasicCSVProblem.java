
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BasicCSVProblem {
	public static void main(String[] args) {
		//writting data to CSV file
		int rows=0;
		try(BufferedWriter bfw=new BufferedWriter(new FileWriter("gcr-codebase/csv-data-handling/BasicCSVProblemOutput.csv"))) {
			bfw.write("ID,Name,Department,Salary\n");
			bfw.write("104,Anurag,Developr,45000\n");
			bfw.write("105,Aakash,HR,50000\n");
			bfw.write("106,Aditya,Manager,60000\n");
			bfw.write("106,Prashant,Developer,45000\n");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//reading data
		try(BufferedReader bfr=new BufferedReader(new FileReader("gcr-codebase/csv-data-handling/StudentRecord.csv"))){
			String line;
			while((line=bfr.readLine())!=null) {
				rows++;
				String[]col=line.split(",");
				System.out.println("ID: "+col[0]+"| Name: "+col[1]+"| age: "+col[2]+"| mark: "+col[3]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//Number of Rows Excluding header
		System.out.println("Rows: "+(rows-1));
	}
	
}
