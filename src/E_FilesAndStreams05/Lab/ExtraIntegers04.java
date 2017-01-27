package E_FilesAndStreams05.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtraIntegers04 {
    public static void main(String[] args) {

        String path = "C:\\Users\\_NERO_\\Desktop\\input.txt";
        String output = "C:\\Users\\_NERO_\\Desktop\\output.txt";

        try(Scanner scan = new Scanner(new FileInputStream(path)); PrintWriter out = new PrintWriter(new FileOutputStream(output))){
            while (scan.hasNext()){
                if(scan.hasNextInt()){
                    out.println(scan.nextInt());
                }
                scan.next();
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
