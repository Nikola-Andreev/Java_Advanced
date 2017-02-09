package I_StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class E_MinEvenNumber05 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>(Arrays.asList(scan.readLine().split("\\s+")));
        OptionalDouble result = list.stream().filter(n -> !n.isEmpty()).mapToDouble(Double::parseDouble).filter(a -> a % 2 == 0).min();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(result.isPresent() ? df.format(result.getAsDouble()) : "No match");
    }
}
