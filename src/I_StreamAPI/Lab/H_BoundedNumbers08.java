package I_StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class H_BoundedNumbers08 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] border = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(Arrays.stream(numbers).filter(n -> n >= Math.min(border[0], border[1])
                && n <= Math.max(border[1], border[0])).toArray()).replace("[","").replace("]","").replace(",",""));
    }
}

