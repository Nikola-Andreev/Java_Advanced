package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class J_ListOfPredicades10 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());
        int[] numbers = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        BiPredicate<Integer, Integer> predicate = (a,b) -> a % b == 0;

        for (int i = 1; i <= number; i++) {
            boolean found = false;
            for (int number1 : numbers) {
                if (!predicate.test(i, number1)) {
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print(i + " ");
            }
        }
    }
}
