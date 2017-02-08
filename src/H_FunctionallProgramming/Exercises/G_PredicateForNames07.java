package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class G_PredicateForNames07 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());
        String[] input = scan.readLine().split(" ");
        Predicate<String> predicate = a -> a.length() <= number;
        for (String anInput : input) {
            if (predicate.test(anInput)) {
                System.out.println(anInput);
            }
        }
    }
}
