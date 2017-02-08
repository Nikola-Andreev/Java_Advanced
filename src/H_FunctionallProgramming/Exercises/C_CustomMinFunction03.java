package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class C_CustomMinFunction03 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split(" ");
        Integer[] numberArray = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            numberArray[i] = Integer.parseInt(input[i]);
        }
        Function<Integer[], Integer> minNumber = numbers -> Collections.min(Arrays.asList(numbers));
        System.out.println(minNumber.apply(numberArray));
    }
}
