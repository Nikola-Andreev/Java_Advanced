package D_SetAndMaps04.Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        TreeMap<Character, Integer> result = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (result.containsKey(input.charAt(i))) {
                result.replace(input.charAt(i), result.get(input.charAt(i)) + 1);
            } else {
                result.put(input.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> s : result.entrySet()) {
            System.out.println(s.getKey() + ": " + s.getValue() + " time/s");
        }
    }
}
