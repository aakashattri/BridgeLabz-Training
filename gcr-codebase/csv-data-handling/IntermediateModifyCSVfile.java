
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IntermediateModifyCSVfile {

    public static void main(String[] args) {
        String inputFile="gcr-codebase/csv-data-handling/BasicCSVProblemOutput.csv";
        String outputFile="gcr-codebase/csv-data-handling/UpdatedEmployeeRecord.csv";
        try (
            BufferedReader bfr=new BufferedReader(new FileReader(inputFile));
            BufferedWriter bfw=new BufferedWriter(new FileWriter(outputFile))
        ) {            
        	String line;
            line=bfr.readLine();
            bfw.write(line);
            bfw.newLine();
            while ((line=bfr.readLine()) != null) {
                String[]col=line.split(",");
                String id=col[0].trim();
                String name=col[1].trim();
                String department=col[2].trim();
                double salary=Double.parseDouble(col[3].trim());
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }
                bfw.write(id+","+name+","+department+","+salary);
                bfw.newLine();
            }
            System.out.println("CSV file updated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
