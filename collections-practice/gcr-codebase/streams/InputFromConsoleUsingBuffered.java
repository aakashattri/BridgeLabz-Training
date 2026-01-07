
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromConsoleUsingBuffered {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter your Name:");
        System.out.println("Enter your Age:");
        System.out.println("Enter your Favorite Programming Language:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/collections_practice/streams/output2.txt")
        );

        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            bw.write(input);
            bw.newLine();
        }

        bw.close();
        br.close();

        System.out.println("Data successfully written to file.");
    }
}