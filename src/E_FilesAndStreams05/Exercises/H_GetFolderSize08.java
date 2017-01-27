package E_FilesAndStreams05.Exercises;

import java.io.File;
import java.util.ArrayDeque;

public class H_GetFolderSize08 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\_NERO_\\Desktop\\Оценени домашни");
        ArrayDeque<File> files = new ArrayDeque<>();
        files.offer(file);
        long bytes = 0;

        while (!files.isEmpty()){
            File current = files.poll();
            for (File file1 : current.listFiles()) {
                if(file1.isDirectory()){
                    files.offer(file1);
                } else {
                    bytes += file1.length();
                }
            }
        }
        System.out.println("Folder size: " + bytes);
    }
}
