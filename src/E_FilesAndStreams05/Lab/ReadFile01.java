package E_FilesAndStreams05.Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile01 {
    public static void main(String[] args) {

        String path = "C:\\Users\\_NERO_\\Desktop\\input.txt";

        try( FileInputStream fis = new FileInputStream(path)){
            int oneByte = fis.read();
            while (oneByte >= 0) {
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte = fis.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
