package G_RegularExpressions.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class I_ValidUsernames09 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String input = scan.readLine();
        String regex = "(?<=[ \\/\\\\()]|^)[a-zA-Z][a-zA-Z0-9_]{2,25}(?=[ \\/\\\\()]|$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        LinkedList<String> userNames = new LinkedList<>();

        while (matcher.find()){
            userNames.add(matcher.group().trim());
        }

        int maxLength = -1, index1 = 0, index2 = 0;

        for (int i = 0; i < userNames.size()-1; i++) {
            int len = userNames.get(i).length() + userNames.get(i+1).length();
            if (len > maxLength){
                index1 = i;
                index2 = i+1;
                maxLength = len;
            }
        }

        System.out.println(userNames.get(index1));
        System.out.println(userNames.get(index2));
    }
}
