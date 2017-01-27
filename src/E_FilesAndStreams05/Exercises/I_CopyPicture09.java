package E_FilesAndStreams05.Exercises;

import java.io.*;

public class I_CopyPicture09 {
    public static void main(String[] args) {

        try(InputStream is = new FileInputStream(new File("C:\\Users\\_NERO_\\Desktop\\abc.jpg"));
            OutputStream os = new FileOutputStream(new File("C:\\Users\\_NERO_\\Desktop\\picture-copy.jpg"));){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
