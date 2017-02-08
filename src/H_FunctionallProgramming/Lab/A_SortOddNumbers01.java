package H_FunctionallProgramming.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A_SortOddNumbers01 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split(", ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : input) {
            numbers.add(Integer.valueOf(s));
        }
        numbers.removeIf(n -> n%2 != 0);
        System.out.println(Arrays.toString(numbers.toArray()).replace("[","").replace("]",""));
        numbers.sort(Integer::compareTo);
        System.out.println(Arrays.toString(numbers.toArray()).replace("[","").replace("]",""));
    }
}
