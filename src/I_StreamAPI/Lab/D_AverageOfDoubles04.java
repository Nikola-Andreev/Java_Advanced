package I_StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;

public class D_AverageOfDoubles04 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<String> input = new ArrayList<String>(Arrays.asList(scan.readLine().split("\\s+")));
        OptionalDouble average = input.stream().filter(a -> !a.isEmpty()).mapToDouble(Double::parseDouble).average();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(average.isPresent() ? df.format(average.getAsDouble()) : "No match");
    }
}
