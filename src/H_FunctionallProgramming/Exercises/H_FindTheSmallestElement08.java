package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class H_FindTheSmallestElement08 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(scan.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int min = numbers[0];
        int m = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
                m = i;
            }
        }
        System.out.println(m);
    }
}
