
public class BufferAndBuilder {
    public static void main(String[] args) {
        String str="hello";
        StringBuilder sb=new StringBuilder();
        StringBuffer sf=new StringBuffer();

        int count=1000000;
        long StartTimeSf=System.nanoTime();
        for(int i=1;i<=count;i++) {
            sb.append(str);
        }
        long endTimeSf=System.nanoTime();
        long timeTakenSf=(endTimeSf-StartTimeSf)/1000000;

        long StartTimeSb=System.nanoTime();
        for(int i=1;i<=count;i++) {
            sb.append(str);
        }
        long endTimeSb=System.nanoTime();
        long timeTakenSb=(endTimeSb-StartTimeSb)/1000000;

        System.out.println("Time taken by StringBuffer: "+timeTakenSf);
        System.out.println("Time taken by StringBuilder: "+timeTakenSb);
    }
}