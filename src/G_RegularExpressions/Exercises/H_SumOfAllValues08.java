package G_RegularExpressions.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H_SumOfAllValues08 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String stringKey = scan.readLine();
        String text = scan.readLine();
        String startKeyRegex = "^[a-zA-Z_]+(?=[0-9])";
        Pattern patternStartKey = Pattern.compile(startKeyRegex);
        Matcher matcherStartKey = patternStartKey.matcher(stringKey);
        String startKey = "";
        String endKeyRegex = "(?<=[0-9])[a-zA-Z_]+$";
        Pattern patternEndKey = Pattern.compile(endKeyRegex);
        Matcher matcherEndKey = patternEndKey.matcher(stringKey);
        String endKey = "";

        if (matcherStartKey.find() && matcherEndKey.find()){
            startKey = matcherStartKey.group();
            endKey = matcherEndKey.group();
            String regex = startKey+"[0-9.]+?" + endKey;
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            double result = 0.0;

            while (matcher.find()){
                try {
                    double a = Double.parseDouble(matcher.group()
                            .substring(startKey.length(), matcher.group().length() - endKey.length()));
                    result += a;
                } catch (Exception ignored){}
            }

            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(result > 0 ? "<p>The total value is: <em>"+df.format(result)+"</em></p>" : "<p>The total value is: <em>nothing</em></p>");
        } else {
            System.out.println("<p>A key is missing</p>");
        }
    }
}
