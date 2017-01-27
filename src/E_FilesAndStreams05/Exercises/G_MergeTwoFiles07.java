package E_FilesAndStreams05.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class G_MergeTwoFiles07 {
    public static void main(String[] args) {

        String first = "C:\\Users\\_NERO_\\Desktop\\test.txt";
        String second = "C:\\Users\\_NERO_\\Desktop\\words.txt";
        String out = "C:\\Users\\_NERO_\\Desktop\\output.txt";

        try(BufferedReader bf1 = new BufferedReader(new FileReader(first));
            BufferedReader bf2 = new BufferedReader(new FileReader(second));
            FileWriter fw = new FileWriter(out,true)){

            String line = bf1.readLine();
            while (line != null){
                fw.write(line);
                fw.write(System.getProperty( "line.separator" ));
                line = bf1.readLine();
            }

            line = bf2.readLine();
            while (line != null){
                fw.write(line);
                fw.write(System.getProperty( "line.separator" ));
                line = bf2.readLine();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
