package E_FilesAndStreams05.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class E_LineNumbers05 {
    public static void main(String[] args) {

        String in = "C:\\Users\\_NERO_\\Desktop\\test.txt";
        String out = "C:\\Users\\_NERO_\\Desktop\\output.txt";

        int counter = 1;
        try (BufferedReader bf = new BufferedReader(new FileReader(in)); FileWriter fw = new FileWriter(out)){
            String line = bf.readLine();
            while (line != null){
                fw.write(counter++ + ". " + line);
                fw.write(System.getProperty( "line.separator" ));
                line = bf.readLine();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
