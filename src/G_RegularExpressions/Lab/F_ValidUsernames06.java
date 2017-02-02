package G_RegularExpressions.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F_ValidUsernames06 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "^[a-zA-Z0-9_-]{3,16}$";
        Pattern pattern = Pattern.compile(regex);

        while(true){
            String input = scan.readLine();
            if ("END".equals(input)){break;}
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }
    }
}
