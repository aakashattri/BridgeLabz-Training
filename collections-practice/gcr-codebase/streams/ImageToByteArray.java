
import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {

        String sourceImage = "src/collections_practice/streams/testing.png";
        String outputImage = "output.jpg";

        try {
            FileInputStream fis=new FileInputStream(sourceImage);

            ByteArrayOutputStream baos=new ByteArrayOutputStream();

            int data;
            while ((data=fis.read())!=-1) {
                baos.write(data);
            }

            byte[] imageBytes=baos.toByteArray();

            fis.close();
            baos.close();

            // 🔹 Write byte array back to image
            ByteArrayInputStream bais=new ByteArrayInputStream(imageBytes);
            FileOutputStream fos=new FileOutputStream(outputImage);

            int b;
            while ((b=bais.read())!=-1) {
                fos.write(b);
            }

            bais.close();
            fos.close();

            System.out.println("Image converted to byte array and written back successfully.");
            System.out.println("Original size : " + new File(sourceImage).length());
            System.out.println("New file size : " + new File(outputImage).length());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}