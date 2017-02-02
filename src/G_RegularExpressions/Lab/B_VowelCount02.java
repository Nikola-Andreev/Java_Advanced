package G_RegularExpressions.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_VowelCount02 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "[aeiouy]";
        String input = scan.readLine().toLowerCase();
        int vowels = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            vowels++;
        }

        System.out.println("Vowels: " + vowels);
    }
}
