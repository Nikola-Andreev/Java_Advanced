package E_FilesAndStreams05.Lab;

import java.io.File;

public class ListFiles07 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\_NERO_\\Desktop\\Files-and-Streams");

        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for (File file1 : files) {
                    if(!file1.isDirectory()){
                        System.out.printf("%s: %s%n", file1.getName(), file1.length());
                    }
                }
            }
        }
    }
}
