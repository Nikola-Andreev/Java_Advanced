package I_StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class C_StidentsByAge03 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();

        while (true){
            String[] input = scan.readLine().split("\\s+");
            if("END".equals(input[0])){
                break;
            }
            students.put(input[0] + " " + input[1], Integer.valueOf(input[2]));
        }
        students.entrySet().stream().filter(a -> a.getValue() >= 18 && a.getValue() <= 24)
                .forEach(student -> System.out.println(student.getKey() + " " +student.getValue()));
    }
}
