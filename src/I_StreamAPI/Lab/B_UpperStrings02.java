package I_StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_UpperStrings02 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split("\\+");
        Arrays.stream(input).map(element -> element = element.toUpperCase()).forEach( e -> System.out.println(e + " "));
    }
}
