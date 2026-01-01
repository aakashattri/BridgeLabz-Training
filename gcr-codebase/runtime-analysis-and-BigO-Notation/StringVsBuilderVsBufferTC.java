
public class StringVsBuilderVsBufferTC{
    public static void main(String[] args){
        int[] operations={1000,10000,1000000};
        String word="test";

        for(int N:operations){
            System.out.println("Operations Count: "+N);

            double stringTime=-1;
            if(N<=10000){
                long startString=System.nanoTime();
                String str="";
                for(int i=0;i<N;i++){
                    str+=word;
                }
                long endString=System.nanoTime();
                stringTime=(endString-startString)/1000000.0;
                System.out.printf("String concatenation took: %.6f ms%n",stringTime);
            }else{
                System.out.println("String concatenation is infeasible for this operation count.");
            }

            long startStringBuilder=System.nanoTime();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<N;i++){
                sb.append(word);
            }
            long endStringBuilder=System.nanoTime();
            double stringBuilderTime=(endStringBuilder-startStringBuilder)/1000000.0;
            System.out.printf("StringBuilder concatenation took: %.6f ms%n",stringBuilderTime);

            long startStringBuffer=System.nanoTime();
            StringBuffer sbf=new StringBuffer();
            for(int i=0;i<N;i++){
                sbf.append(word);
            }
            long endStringBuffer=System.nanoTime();
            double stringBufferTime=(endStringBuffer-startStringBuffer)/1000000.0;
            System.out.printf("StringBuffer concatenation took: %.6f ms%n",stringBufferTime);

            System.out.println("--------------------------------------------------");
        }
    }
}