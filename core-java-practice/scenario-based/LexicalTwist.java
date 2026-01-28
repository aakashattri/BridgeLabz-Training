

import java.util.*;

public class LexicalTwist {

    public void checkingIfReversed(String secondWord,String firstWord){
        StringBuilder sb=new StringBuilder(secondWord);
        if(firstWord.equalsIgnoreCase(sb.reverse().toString())){
            System.out.println(ifReversed(firstWord,secondWord));
        }else{
            ifNotReversed(firstWord,secondWord);
        }
    }

    public String ifReversed(String firstWord,String secondWord){
        StringBuilder sb=new StringBuilder(firstWord);
        String reversedFirstWord=sb.reverse().toString().toLowerCase();
        for(char ch:reversedFirstWord.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                reversedFirstWord=reversedFirstWord.replace(ch,'@');
            }
        }
        return reversedFirstWord;
    }

    public void ifNotReversed(String firstWord,String secondWord){
        int vowels=0;
        int conso=0;
        String combined=(firstWord+secondWord).toUpperCase();

        for(char ch:combined.toCharArray()){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;
            }else{
                conso++;
            }
        }

        if(vowels>conso){
            LinkedHashSet<Character> set=new LinkedHashSet<>();
            for(char ch:combined.toCharArray()){
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    set.add(ch);
                    if(set.size()==2)break;
                }
            }
            for(char c:set)System.out.print(c);
        }

        if(conso>vowels){
            LinkedHashSet<Character> set=new LinkedHashSet<>();
            for(char ch:combined.toCharArray()){
                if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                    set.add(ch);
                    if(set.size()==2)break;
                }
            }
            for(char c:set)System.out.print(c);
        }

        if(vowels==conso){
            System.out.println("Vowels and consonants are equal");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Word:");
        String firstWord=sc.nextLine();
        System.out.println("Enter Second Word:");
        String secondWord=sc.nextLine();
        if(firstWord.contains(" ")){
            System.out.println(firstWord+" is an invalid word");
            return;
        }
        if(secondWord.contains(" ")){
            System.out.println(secondWord+" is an invalid word");
            return;
        }
        LexicalTwist lexical=new LexicalTwist();
        lexical.checkingIfReversed(secondWord,firstWord);
    }
}