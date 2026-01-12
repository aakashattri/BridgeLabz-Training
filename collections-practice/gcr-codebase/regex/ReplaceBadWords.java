import java.util.regex.*;

public class ReplaceBadWords {

    public static void main(String[] args) {
        String[]badWords= {"damn","stupid","crackhead","dutchbag","dumb","stupidass","jerk"};
        String script="Are you dumb,how can you be this stupid adam , Marry told me that you are a huge dutchbag but i didnt belive her at that time but now in know that i never see more dumb than you . You are a jerk Adam and i am a stupid ass to give you work";

        String regex="\\b("+String.join("|", badWords)+")\\b";

        Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Matcher matcher=pattern.matcher(script);

        String rightScript=matcher.replaceAll("****");

        System.out.println(rightScript);

    }


}