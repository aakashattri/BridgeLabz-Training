public class RotationalString {
    public static void main(String[] args){
        String str1 = "abbbcc" ; //abbbccabbbcc
        String str2 = "bccabb" ;
        if(str1.length() !=  str2.length()){
            System.out.println("NOT ROTATIONAL");
        }
        else{
            String f = str1 + str1 ;
            if(f.contains(str2)){
                System.out.println("YES ROTATIONAL");
            }
            else{
                System.out.println("NOT ROTATIONAL ");
            }
        }
    }
}
