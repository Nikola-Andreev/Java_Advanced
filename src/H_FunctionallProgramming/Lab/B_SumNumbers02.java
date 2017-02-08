package H_FunctionallProgramming.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class B_SumNumbers02 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(scan.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + IntStream.of(input).sum());
    }
}
