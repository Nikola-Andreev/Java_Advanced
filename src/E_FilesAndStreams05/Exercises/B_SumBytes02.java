package E_FilesAndStreams05.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;

public class B_SumBytes02 {
    public static void main(String[] args) {

        String path = "C:\\Users\\_NERO_\\Desktop\\test.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            long sum = 0;
            while (line != null){
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                line = bf.readLine();
            }
            System.out.println(sum);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
