package E_FilesAndStreams05.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyBytes03 {
    public static void main(String[] args) {

        String path = "C:\\Users\\_NERO_\\Desktop\\input.txt";
        String output = "C:\\Users\\_NERO_\\Desktop\\output.txt";

        try (InputStream in = new FileInputStream(path); OutputStream out = new FileOutputStream(output);){
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0){
                if(oneByte == 10 || oneByte == 32){
                    out.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        out.write(digits.charAt(i));
                    }
                }
            }
        } catch (Exception e){
            System.out.println();
        }
    }
}
