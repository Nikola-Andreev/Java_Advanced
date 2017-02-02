package G_RegularExpressions.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C_SeriesOfLetters03 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "(?<all>(?<letter>[a-zA-Z])\\k<letter>+)";
        Pattern pattern = Pattern.compile(regex);
        String input = scan.readLine();
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            input = input.replaceFirst(matcher.group("all"),matcher.group("letter"));
        }

        System.out.println(input);
    }
}
