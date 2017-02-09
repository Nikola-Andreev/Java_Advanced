package I_StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_TakeTwo01 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumbers = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(inputNumbers).filter(num -> num >= 10 && num <= 20).distinct().limit(2).forEach(n -> System.out.print(n + " "));
    }
}
