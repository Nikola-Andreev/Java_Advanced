package G_RegularExpressions.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_MatchPhoneNumber02 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "^\\+359(?<delimiter> |-)2\\k<delimiter>\\d{3}\\k<delimiter>\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        while (true){
            String input = scan.readLine();
            if ("end".equals(input)){break;}
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                System.out.println(matcher.group(0));
            }
        }
    }
}
