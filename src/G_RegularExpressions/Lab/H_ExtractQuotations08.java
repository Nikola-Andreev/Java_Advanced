package G_RegularExpressions.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H_ExtractQuotations08 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "(?<valid>\"|')(.*?)(\\k<valid>)";
        Pattern pattern = Pattern.compile(regex);
        String input = scan.readLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group(0).substring(1,matcher.group(0).length()-1));
        }
    }
}
