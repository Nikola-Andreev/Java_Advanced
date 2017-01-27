package E_FilesAndStreams05.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;

public class A_SumLines01 {
    public static void main(String[] args) {

        String path = "C:\\Users\\_NERO_\\Desktop\\test.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();
            while (line != null){
                int sum = 0;
                for (int j = 0; j < line.length(); j++) {
                    sum += line.charAt(j);
                }
                System.out.println(sum);
                line = bf.readLine();
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
