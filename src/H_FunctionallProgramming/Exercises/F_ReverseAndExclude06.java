package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class F_ReverseAndExclude06 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int divider = Integer.parseInt(scan.readLine());
        int[] result = Arrays.stream(numbers).filter(a ->  Math.abs(a % divider) > 0).toArray();
        for (int i = result.length-1; i >= 0 ; i--) {
            System.out.print(result[i]+" ");
        }
    }
}
