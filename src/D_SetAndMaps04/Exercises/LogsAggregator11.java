package D_SetAndMaps04.Exercises;

import java.util.*;

public class LogsAggregator11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        TreeMap<String, HashMap<Integer, TreeSet<String>>> store = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String[] inputTokens = scan.nextLine().split(" ");
            String ip = inputTokens[0];
            String user = inputTokens[1];
            Integer duration = Integer.parseInt(inputTokens[2]);

            if(store.containsKey(user)){
                int oldDuration = (int)store.get(user).keySet().toArray()[0];
                int newValue = oldDuration + duration;
                store.get(user).get(oldDuration).add(ip);
                TreeSet<String> old = store.get(user).get(oldDuration);
                store.get(user).clear();
                store.get(user).put(newValue, old);
            } else {
                TreeSet<String> ips = new TreeSet<>();
                ips.add(ip);
                HashMap<Integer, TreeSet<String>> innerMap = new HashMap<>();
                innerMap.put(duration,ips);
                store.put(user, innerMap);
            }
        }

        for (String s : store.keySet()) {
            int key = (int)store.get(s).keySet().toArray()[0];
            System.out.println(s + ": " + key + " " + store.get(s).get(key));
        }
    }
}
