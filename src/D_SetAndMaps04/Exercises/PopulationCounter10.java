package D_SetAndMaps04.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class PopulationCounter10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Long>> populationStore = new LinkedHashMap<>();

        while (true){
            String input = scan.nextLine();
            if("report".equals(input)){
                break;
            }

            String[] tokens = input.split("\\|");
            String town = tokens[0];
            String country = tokens[1];
            Long population = Long.parseLong(tokens[2]);
            if(populationStore.containsKey(country)){
                if(populationStore.get(country).containsKey(town)){
                    populationStore.get(country).replace(town, populationStore.get(country).get(town) + population);
                } else {
                    populationStore.get(country).put(town, population);
                }
            } else {
                LinkedHashMap<String, Long> townPopulation = new LinkedHashMap<>();
                townPopulation.put(town,population);
                populationStore.put(country,townPopulation);
            }
        }

        LinkedHashMap<String, Long> result = new LinkedHashMap<>();

        for (String s : populationStore.keySet()) {
            LinkedHashMap<String, Long> sorted = populationStore.get(s).entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            Long totalPopulation = 0l;
            String towns = "";
            for (String s1 : sorted.keySet()) {
                Long townPop = populationStore.get(s).get(s1);
                totalPopulation += townPop;
                towns += "=>" + s1 + ": " + townPop + "\n";
            }
            towns =  s + " (total population: " + totalPopulation + ")" + "\n" + towns.substring(0,towns.length()-1);
            result.put(towns, totalPopulation);
        }

        LinkedHashMap<String, Long> sorted = result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String s : sorted.keySet()) {
            System.out.println(s);
        }
    }
}
