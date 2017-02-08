package H_FunctionallProgramming.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C_CountUpperCaseWord03 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Object input[] = Arrays.stream(scan.readLine().split(" ")).filter(s -> !s.equals("")).toArray();
        Predicate<Object> checkForUpperCase = string -> string.toString().charAt(0) == string.toString().toUpperCase().charAt(0);
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        List<Object> result = new ArrayList<>();
        for (Object s : input) {
            Matcher matcher = pattern.matcher(s.toString().charAt(0)+"");
            if(checkForUpperCase.test(s) && matcher.find()){
                result.add(s.toString().trim());
            }
        }
        System.out.println(result.size());
        for (Object s : result) {
            System.out.println(s);
        }
    }
}
