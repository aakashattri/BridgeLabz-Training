
public class ConcatenateStringUsingStringBuffer {
    public static void main(String[] args) {
        String[]words= {"anurag","rajput","belongs","to","noOne","!!"};


        StringBuffer sf=new StringBuffer();
        for(int i=0;i<words.length;i++) {
            sf.append(words[i]+" ");
        }

        System.out.println(sf.toString());
    }
}