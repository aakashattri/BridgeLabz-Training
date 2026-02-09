

import java.util.Scanner;

class Program{
    public static String CleanseAndInvert(String input){
        if(input==null||input.length()<6)
            return "";

        for(char c:input.toCharArray()){
            if(!Character.isLetter(c))
                return "";
        }

        String filtered="";
        for(char c:input.toLowerCase().toCharArray()){
            if(c%2!=0)
                filtered+=c;
        }

        String rev=new StringBuilder(filtered).reverse().toString();
        char[] arr=rev.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                arr[i]=Character.toUpperCase(arr[i]);
        }
        return new String(arr);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String input=sc.nextLine();

        String result=CleanseAndInvert(input);

        if(result.equals(""))
            System.out.println("Invalid Input");
        else
            System.out.println("The generated key is - "+result);
    }
}
