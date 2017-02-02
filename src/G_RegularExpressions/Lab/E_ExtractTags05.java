package G_RegularExpressions.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E_ExtractTags05 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "<.+?>";
        Pattern pattern = Pattern.compile(regex);

        while(true){
            String input = scan.readLine();
            if ("END".equals(input)){break;}
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                System.out.println(matcher.group(0));
            }
        }
    }
}
