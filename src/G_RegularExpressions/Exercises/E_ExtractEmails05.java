package G_RegularExpressions.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E_ExtractEmails05 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "(^| )[0-9a-zA-Z]+(\\.|-|_)?[0-9a-zA-Z]+@[a-zA-Z]+-?([a-zA-Z]+)?\\.[a-zA-Z]+(\\.[a-zA-Z]+)?(?=,| |.|$)";
        Pattern pattern = Pattern.compile(regex);
        String text = scan.readLine();
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(0).trim());
        }
    }
}
