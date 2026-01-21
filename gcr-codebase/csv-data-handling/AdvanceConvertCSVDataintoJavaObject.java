import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;
public class AdvanceConvertCSVDataintoJavaObject {
	
	public static void main(String[] args) {
		try{
			FileReader fr=new FileReader("src/io_progaramming_practice/csv_data_Handling/BasicCSVProblemOutput.csv");
			CsvToBean<Employee>csvToBean=new CsvToBeanBuilder<Employee>(fr).withType(Employee.class).withIgnoreLeadingWhiteSpace(true).build();
			List<Employee>ll=csvToBean.parse();
			
			for(Employee emp:ll) {
				System.out.println("Id: "+emp.getId()+"| Name: "+emp.getName()+"| Department: "+emp.getDepartment()+"| Salary: "+emp.getSalary());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
