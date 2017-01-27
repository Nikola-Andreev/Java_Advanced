package E_FilesAndStreams05.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFile02 {
    public static void main(String[] args) {

        String path = "C:\\Users\\_NERO_\\Desktop\\input.txt";
        String output = "C:\\Users\\_NERO_\\Desktop\\output.txt";
        List<Character> chars = new ArrayList<Character>();
        Collections.addAll(chars, ',', '.', '!', '?');

        try(InputStream stream = new FileInputStream(path); OutputStream out = new FileOutputStream(output);){
            int oneByte = 0;
            while ((oneByte = stream.read()) >= 0){
                if(!chars.contains((char)oneByte)){
                    out.write(oneByte);
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
