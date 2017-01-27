package E_FilesAndStreams05.Lab;

import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders08 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\_NERO_\\Desktop\\Files-and-Streams");
        ArrayDeque<File> files = new ArrayDeque<>();
        files.offer(file);
        int counter = 1;
        while (!files.isEmpty()){
            File current = files.poll();
            for (File file1 : current.listFiles()) {
                if(file1.isDirectory()){
                    files.offer(file1);
                    counter++;
                }
            }

            System.out.println(current.getName());
        }
        System.out.println(counter + " folders");
    }
}
