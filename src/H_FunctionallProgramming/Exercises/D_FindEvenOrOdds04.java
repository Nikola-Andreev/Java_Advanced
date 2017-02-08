package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class D_FindEvenOrOdds04 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if ("even".equals(scan.readLine())) {
            PrintOddOrEven(input, 0);
        } else {
            PrintOddOrEven(input, 1);
        }
    }

    private static void PrintOddOrEven(int[] input, int rest) {

        Predicate<Integer> isEven = number -> Math.abs(number% 2) == rest;
        for (int i = input[0]; i <= input[1]; i++) {
            if (isEven.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
