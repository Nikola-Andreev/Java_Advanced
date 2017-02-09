package I_StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A_StidentsByGroup01 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<String> students = new ArrayList<>();

        while (true){
            String[] input = scan.readLine().split("\\s+");
            if("END".equals(input[0])){
                break;
            }
            if("2".equals(input[2])){
                students.add(input[0] + " " + input[1]);
            }
        }
        students.stream().sorted((a,b) -> a.split(" ")[0].compareTo(b.split(" ")[0])).forEach(System.out::println);
    }
}
