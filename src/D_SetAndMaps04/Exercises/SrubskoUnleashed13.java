package D_SetAndMaps04.Exercises;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SrubskoUnleashed13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String regex = "^([a-zA-Z]+ )([a-zA-Z]+ )?([a-zA-Z]+ )?@([a-zA-Z]+ )([a-zA-Z]+ )?([a-zA-Z]+ )?(\\d+) (\\d+)";
        LinkedHashMap<String, LinkedHashMap<String, Long>> concertsStore = new LinkedHashMap<>();

        while (true){
            String input = scan.nextLine();
            if("End".equals(input)){
                break;
            }

            if(input.matches(regex)){
                String[] tokens = input.split("@");
                String singerName = tokens[0].trim();
                String destinationName = tokens[1].split("(\\d+ )")[0].trim();
                String[] priceTokens = tokens[1].split(" ");
                int ticketPrice = Integer.parseInt(priceTokens[priceTokens.length-2]);
                int ticketCount = Integer.parseInt(priceTokens[priceTokens.length-1]);
                long total = ticketCount*ticketPrice;
                if(concertsStore.containsKey(destinationName)){
                    if(concertsStore.get(destinationName).containsKey(singerName)){
                        concertsStore.get(destinationName).replace(singerName, concertsStore.get(destinationName).get(singerName)+total);
                    } else {
                        concertsStore.get(destinationName).put(singerName, total);
                    }
                } else {
                    LinkedHashMap<String, Long> singerData = new LinkedHashMap<>();
                    singerData.put(singerName, total);
                    concertsStore.put(destinationName, singerData);
                }
            }
        }

        for (String s : concertsStore.keySet()) {
            System.out.println(s);

            LinkedHashMap<String, Long> sorted = concertsStore.get(s).entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            for (String s1 : sorted.keySet()) {
               System.out.println("#  " + s1 + " -> " + concertsStore.get(s).get(s1));
            }
        }
    }
}
