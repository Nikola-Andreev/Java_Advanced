package D_SetAndMaps04.Lab;

import java.util.*;

public class CountSameValues04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> store = new HashMap<>();
        String[] input = scan.nextLine().split(" ");

        for (String anArray : input) {
            if (store.containsKey(anArray)) {
                store.replace(anArray, store.get(anArray) + 1);
            } else {
                store.put(anArray, 1);
            }
        }

        for (Map.Entry<String, Integer> value: store.entrySet()) {
            System.out.println(value.getKey() + " - " + value.getValue() + " times");
        }
    }
}
