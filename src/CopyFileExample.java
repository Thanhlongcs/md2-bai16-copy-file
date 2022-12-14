import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        try{
            inStream =  new FileInputStream(new File("C:\\Users\\THINKPAD\\IdeaProjects\\md2-bai16-copyfile\\src\\text1.txt"));
            outStream = new FileOutputStream(new File("C:\\Users\\THINKPAD\\IdeaProjects\\md2-bai16-copyfile\\src\\text2.txt"));
            int length;
            byte[] buffer = new byte[1024];
            while((length = inStream.read(buffer))>0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");

        }catch (IOException e ) {
            e.printStackTrace();
        }finally {
            inStream.close();
            outStream.close();
        }
    }
}
