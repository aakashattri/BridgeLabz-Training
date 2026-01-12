
import java.util.Scanner;

public class ParagraphEditor {
    public static int countWords(String para) {
        String[]words=para.split("\\s+");
        return words.length;
    }
    public static String longestWord(String para) {
        String[]words=para.split("\\s+");
        String longest = words[0] ;
        for(String s : words) {
            if(s.length() > longest.length()) {
                longest = s ;
            }
        }
        return longest ;
    }
    public static String replaceWord(String para,String replaceWord,String specificWord) {

        return para.replace(replaceWord, specificWord);

    }
    public static void edgeCases(String paragraph) {
        Scanner sc = new Scanner(System.in);
        paragraph=paragraph.trim();
        if (paragraph.length()==0) {
            System.out.println("Empty String");
            return;
        }
        int count=countWords(paragraph);
        System.out.println("Words in the paragraph: " + count);

        String longest=longestWord(paragraph);
        System.out.println("Longest word: " + longest);

        System.out.print("Enter the word you want to replace: ");
        String oldWord=sc.next();

        System.out.print("Enter the new word: ");
        String newWord=sc.next();

        paragraph =replaceWord(paragraph, oldWord, newWord);

        System.out.println("Updated Paragraph:");
        System.out.println(paragraph);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");

        String paragraph=sc.nextLine();

        edgeCases(paragraph);

    }
}