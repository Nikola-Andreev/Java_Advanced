package G_RegularExpressions.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_MatchCount01 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String target = scan.readLine();
        String text = scan.readLine();

        Pattern pattern = Pattern.compile(target);
        Matcher matcher = pattern.matcher(text);
        int counter = 0;

        while (matcher.find()){
            counter++;
        }

        System.out.println(counter);
    }
}
