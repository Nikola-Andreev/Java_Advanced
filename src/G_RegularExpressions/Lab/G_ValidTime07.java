package G_RegularExpressions.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G_ValidTime07 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "^(\\d{2}):(\\d{2}):(\\d{2}) [AP]M$";
        Pattern pattern = Pattern.compile(regex);

        while(true){
            String input = scan.readLine();
            if ("END".equals(input)){break;}
            Matcher matcher = pattern.matcher(input);
            if (matcher.find() && isValidTime(matcher.group(0))){
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }
    }

    private static boolean isValidTime(String group) {
        String[] timeTokens = group.split(":");
        int seconds = Integer.parseInt(timeTokens[2].split(" ")[0]);
        int minutes = Integer.parseInt(timeTokens[1]);
        int hours = Integer.parseInt(timeTokens[0]);
        return seconds >= 0 && seconds < 60 && minutes >= 0 && minutes < 60 && hours > 0 && hours < 13;
    }
}
