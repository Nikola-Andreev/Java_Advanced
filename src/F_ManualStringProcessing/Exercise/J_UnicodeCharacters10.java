package F_ManualStringProcessing.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_UnicodeCharacters10 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String input = scan.readLine();
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < input.length(); i++) {
            result.append("\\u").append(Integer.toHexString(input.charAt(i) | 0x10000).substring(1));
        }

        System.out.println(result);
    }
}
