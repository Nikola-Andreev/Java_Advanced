package B_MultidimensionalArrays02.Exercises;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ActivityTracker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        SortedMap[] store = new SortedMap[13];

        for (int i = 0; i < number; i++) {
            String[] input = scan.nextLine().split(" ");
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date startDate;
            try {
                startDate = df.parse(input[0]);
                String[] newDateString = df.format(startDate).split("/");
                int month = Integer.parseInt(newDateString[1]);
                String name = input[1];
                int score = Integer.parseInt(input[2]);
                if(store[month] == null){
                    SortedMap<String,Integer> map = new TreeMap<>();
                    map.put(name,score);
                    store[month] = map;
                } else {
                    Map<String, Integer> selects = store[month];
                    boolean found = false;
                    for(Map.Entry<String, Integer> entry : selects.entrySet()) {
                        String key = entry.getKey();
                        int value = entry.getValue();
                        if(key.equals(name)){
                            score += value;
                            entry.setValue(score);
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        store[month].put(name,score);
                    }
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < store.length; i++) {
            if(store[i] != null) {
                System.out.print(i + ": ");
                int s = 0;
                Map<String, Integer> selects = store[i];
                for (Map.Entry<String, Integer> entry : selects.entrySet()) {
                    System.out.print(entry.getKey()+"("+entry.getValue()+")");
                    s++;
                    if(s < selects.size()){
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }
}
