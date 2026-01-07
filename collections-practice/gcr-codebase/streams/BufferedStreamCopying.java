
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamCopying {
    public static void main(String[] args) {

        try {
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/demo.txt"),4096);
            long beforeExecutionTime=System.nanoTime();
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/collections_practice/streams/output.txt"));
            byte[]buffer=new byte[4096];
            int data;
            while((data=bis.read(buffer))!=-1) {
                bos.write(buffer,0,data);
            }
            long afterExecutionTime=System.nanoTime();

            long timeTakenBufferedStream=afterExecutionTime-beforeExecutionTime;
            System.out.println("Time Taken:"+timeTakenBufferedStream);
            System.out.println("Successfull");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            long beforeExecution=System.nanoTime();
            FileInputStream fis=new FileInputStream("src/demo.txt");
            FileOutputStream fos=new FileOutputStream("output2.txt");
            long afterExecution=System.nanoTime();


            int data;
            while((data=fis.read())!=-1) {
                fos.write(data);
            }
            System.out.println("Time taken by fileStream:"+(afterExecution-beforeExecution));
            System.out.println("File Copied Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}