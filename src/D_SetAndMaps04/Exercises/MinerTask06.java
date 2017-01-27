package D_SetAndMaps04.Exercises;

import java.util.HashMap;
import java.util.Scanner;

public class MinerTask06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, String> goods = new HashMap<>();

        for (long i = 0; i < 2000000000; i+=2) {
            String input = scan.nextLine();
            if("stop".equals(input)){
                break;
            }
            String value = scan.nextLine();
            if(!goods.containsKey(input)) {
                goods.put(input, value);
            } else {
                goods.replace(input, Integer.parseInt(goods.get(input)) + Integer.parseInt(value) + "");
            }
        }

        for (String s : goods.keySet()) {
            System.out.println(s + " -> " + goods.get(s));
        }
    }
}
