package I_StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_StidentsFirstAndLastName02 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<String> students = new ArrayList<>();

        while (true){
            String[] input = scan.readLine().split("\\s+");
            if("END".equals(input[0])){
                break;
            }
            if(input[0].compareTo(input[1]) < 0){
                students.add(input[0] + " " + input[1]);
            }
        }
        students.forEach(System.out::println);
    }
}
