package G_RegularExpressions.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J_QueryMess10 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "[^&?]+=[^&?]+";
        Pattern pattern = Pattern.compile(regex);

        while (true) {
            LinkedHashMap<String, LinkedList<String>> store = new LinkedHashMap<>();
            String input = scan.readLine();
            if("END".equals(input)){break;}
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                String[] tokens = matcher.group().split("=");
                String key = tokens[0].replace("%20"," ").replace("+"," ").trim();
                String value = tokens[1].replace("%20"," ").replace("+"," ").trim().replaceAll(" +", " ");;

                if(store.containsKey(key)){
                    store.get(key).add(value);
                } else {
                    LinkedList<String> val = new LinkedList<>();
                    val.add(value);
                    store.put(key,val);
                }
            }

            for (String s : store.keySet()) {
                System.out.print(s+"="+ Arrays.toString(store.get(s).toArray()));
            }
            System.out.println();
        }
    }
}
