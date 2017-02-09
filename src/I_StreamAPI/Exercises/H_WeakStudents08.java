package I_StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class H_WeakStudents08 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<String> students = new LinkedHashSet<>();

        while (true){
            String input = scan.readLine();
            if("END".equals(input)){
                break;
            }
            students.add(input);
        }
        students.stream().filter(a -> Arrays.stream(a.split(" ")).filter(b -> b.equals("3") || b.equals("2")).toArray().length > 1)
                .forEach(student -> System.out.println(student.split(" ")[0] +" "+ student.split(" ")[1]));
    }
}
