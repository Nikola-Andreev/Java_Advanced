package G_RegularExpressions.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F_SentenceExtractor06 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String keyWord = scan.readLine();
        String regex = "\\b[A-Z][^!.?]*?\\b)"+keyWord+"\\b[^!.?]*?[.!?]";
        Pattern pattern = Pattern.compile(regex);
        String text = scan.readLine();
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group().trim());
        }
    }
}
