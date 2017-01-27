package D_SetAndMaps04.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TreeMap<String, Integer> keyMaterials = new TreeMap<>();
        TreeMap<String, Integer> otherMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        boolean found = false;

        while (true){
            String input = scan.nextLine();
            if("".equals(input)){
                break;
            }
            String[] tokens = input.split(" ");

            for (int i = 0; i < tokens.length; i+=2) {
                int value = Integer.parseInt(tokens[i]);
                String material = tokens[i+1].toLowerCase();
                if("shards".equals(material) || "fragments".equals(material) || "motes".equals(material)){
                    keyMaterials.replace(material, keyMaterials.get(material) + value);
                    if(keyMaterials.get(material) >= 250){
                        switch (material){
                            case "motes":System.out.println("Dragonwrath obtained!");break;
                            case "shards":System.out.println("Shadowmourne obtained!");break;
                            case "fragments":System.out.println("Valanyr obtained!");break;
                            default:break;
                        }
                        keyMaterials.replace(material, keyMaterials.get(material) - 250);
                        found = true;
                        break;
                    }
                } else {
                    if(otherMaterials.containsKey(material)){
                        otherMaterials.replace(material, otherMaterials.get(material) + value);
                    } else {
                        otherMaterials.put(material, value);
                    }
                }
            }
            if(found){
                break;
            }
        }

        LinkedHashMap<String, Integer> sortedKeyMaterials = keyMaterials.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String s : sortedKeyMaterials.keySet()) {
            System.out.println(s + ": " + keyMaterials.get(s));
        }
        for (String s : otherMaterials.keySet()) {
            System.out.println(s + ": " + otherMaterials.get(s));
        }
    }
}
