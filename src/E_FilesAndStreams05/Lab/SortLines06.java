package E_FilesAndStreams05.Lab;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines06 {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\_NERO_\\Desktop\\input.txt");
        Path output = Paths.get("C:\\Users\\_NERO_\\Desktop\\output.txt");

        try{
            List<String> lines = Files.readAllLines(path);
            Collections.sort(lines);
            Files.write(output, lines);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
