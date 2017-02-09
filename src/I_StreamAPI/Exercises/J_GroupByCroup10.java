package I_StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class J_GroupByCroup10 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<Integer, List<String>> persons = new LinkedHashMap<>();

        while (true){
            String[] input = scan.readLine().split(" ");
            if("END".equals(input[0])){
                break;
            }
            String fullName= input[0] + " " + input[1];
            int group = Integer.valueOf(input[2]);
            if (persons.containsKey(group)){
                persons.get(group).add(fullName);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(fullName);
                persons.put(group, temp);
            }
        }
        persons.entrySet().stream().sorted(Map.Entry.comparingByKey(Integer::compareTo)).forEach(entry ->
                System.out.println(entry.getKey() + " - " + Arrays.toString(entry.getValue().toArray()).replace("[","").replace("]","")));
    }
}