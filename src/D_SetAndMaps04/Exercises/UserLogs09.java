package D_SetAndMaps04.Exercises;

import java.util.*;

public class UserLogs09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Integer>> dataStore = new TreeMap<>();

        while (true){
            String input = scan.nextLine();
            if(input.equals("end")){
                break;
            }

            String[] tokens = input.split(" ");
            String name = tokens[2].split("=")[1];
            String ip = tokens[0].split("=")[1];
            if(!dataStore.containsKey(name)){
                LinkedHashMap<String, Integer> user = new LinkedHashMap<>();
                user.put(ip, 1);
                dataStore.put(name, user);
            } else {
                if(!dataStore.get(name).containsKey(ip)){
                    dataStore.get(name).put(ip,1);
                } else {
                    dataStore.get(name).replace(ip, dataStore.get(name).get(ip) + 1);
                }
            }
        }

        for (String s : dataStore.keySet()) {
            System.out.println(s + ":");
            String output = "";
            for (String s1 : dataStore.get(s).keySet()) {
                output += s1 + " => " + dataStore.get(s).get(s1) + ", ";
            }
            System.out.println(output.substring(0,output.length()-2) + ".");
        }
    }
}
