package G_RegularExpressions.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class K_SemanticHTML12 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String openTag = "(?<replace><div).+(?<remove>(id|class) *?= *?\"(?<newName>\\w+)\").+>?";
        String closeTag = "<\\/div>[\\s]*(?<delete><!--[\\s]*?(?<word>\\w+)[\\s]*?-->)";
        Pattern closeTagPattern = Pattern.compile(closeTag);
        Pattern openTagPattern = Pattern.compile(openTag);
        String[] validTags = {"main", "header", "nav", "article", "section", "aside", "footer"};

        while (true) {
            String input = scan.readLine();
            if ("END".equals(input)) {
                break;
            }
            Matcher openTagMatcher = openTagPattern.matcher(input);
            Matcher closeTagMatcher = closeTagPattern.matcher(input);
            if (openTagMatcher.find() && Arrays.asList(validTags).contains(openTagMatcher.group("newName"))) {
                String result = openTagMatcher.group()
                        .replace(openTagMatcher.group("replace"), "<" + openTagMatcher.group("newName"))
                        .replace(openTagMatcher.group("remove"), "");
                System.out.println(result.replaceAll(" +>",">").replaceAll(" +"," "));
            } else if (closeTagMatcher.find() && Arrays.asList(validTags).contains(closeTagMatcher.group("word"))){
                String result = closeTagMatcher.group()
                        .replace("div", closeTagMatcher.group("word"))
                        .replace(closeTagMatcher.group("delete"),"");
                System.out.println(result.replaceAll(" +",""));
            } else {
                System.out.println(input);
            }
        }
    }
}
