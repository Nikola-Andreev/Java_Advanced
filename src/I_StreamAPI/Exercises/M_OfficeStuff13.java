package I_StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class M_OfficeStuff13 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());
        TreeMap<String, LinkedHashMap<String, Integer>> store = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = scan.readLine().split(" - ");
            String companyName = input[0].substring(1, input[0].length());
            int amount = Integer.valueOf(input[1]);
            String product = input[2].substring(0, input[2].length()-1);

            if(store.containsKey(companyName)){
                if(store.get(companyName).containsKey(product)){
                    store.get(companyName).put(product, store.get(companyName).get(product) + amount);
                } else {
                    store.get(companyName).put(product, amount);
                }
            } else {
                LinkedHashMap<String, Integer> temp = new LinkedHashMap<>();
                temp.put(product, amount);
                store.put(companyName, temp);
            }
        }

        for (String s : store.keySet()) {
            String output = "";
            output += s + ": ";
            for (String s1 : store.get(s).keySet()) {
                output+=s1 + "-" + store.get(s).get(s1) + ", ";
            }
            System.out.println(output.substring(0, output.length()-2));
        }
    }
}
