package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I_CustomComparator09 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(scan.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] a = Arrays.stream(numbers).filter(b -> b%2 == 0).boxed().sorted(Integer::compareTo).mapToInt(i -> i).toArray();
        int [] b = Arrays.stream(numbers).filter(c -> c%2 != 0).boxed().sorted(Integer::compareTo).mapToInt(i -> i).toArray();
        System.out.print(Arrays.toString(a).replace("[","").replace("]","").replace(",","") + " ");
        System.out.println(Arrays.toString(b).replace("[","").replace("]","").replace(",",""));
    }
}
