
import java.io.FileWriter;
import java.io.IOException;

public class StudentCSVCreator {

    public static void main(String[] args) {

        String fileName = "src/io_progaramming_practice/csv_data_Handling/studentRecord.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            // Write CSV Header
            writer.append("ID,Name,Age,Mark\n");

            // Write student records
            writer.append("101,Anurag,21,85\n");
            writer.append("102,Rahul,20,78\n");
            writer.append("103,Priya,22,90\n");

            System.out.println("studentRecord.csv file created successfully!");

        } catch (IOException e) {
            System.out.println("Error while creating CSV file");
            e.printStackTrace();
        }
    }
}
