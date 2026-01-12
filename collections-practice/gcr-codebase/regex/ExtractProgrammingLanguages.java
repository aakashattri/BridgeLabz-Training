
import java.util.regex.*;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {

        String text = "java python go";
        String[] languages = {"java", "python", "JavaScript", "Go"};

        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No programming language found");
        }
    }
}