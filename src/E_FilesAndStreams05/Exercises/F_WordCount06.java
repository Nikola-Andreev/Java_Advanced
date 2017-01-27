package E_FilesAndStreams05.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collectors;

public class F_WordCount06 {
    public static void main(String[] args) {

        String in = "C:\\Users\\_NERO_\\Desktop\\test.txt";
        String target = "C:\\Users\\_NERO_\\Desktop\\words.txt";
        String out = "C:\\Users\\_NERO_\\Desktop\\output.txt";

        List<String> targetWords = new ArrayList<>();
        TreeMap<String, Integer> countWords = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        try(BufferedReader bf = new BufferedReader(new FileReader(target));
            BufferedReader bu = new BufferedReader(new FileReader(in));
            FileWriter fw = new FileWriter(out)){

            String line = bf.readLine();
            while (line != null){
                String[] words = line.split("[,. ?!;:'\"&+-/()\\\\|<>]+");
                for (String word : words) {
                    if (!targetWords.contains(word.toLowerCase())) {
                        targetWords.add(word.toLowerCase());
                    }
                }
                line = bf.readLine();
            }

            String inputLine = bu.readLine();
            while (inputLine != null){
                String[] words = inputLine.split("[,. ?!;:'\"&+-/()\\\\|<>]+");
                for (String word : words) {
                    if (countWords.containsKey(word) && targetWords.contains(word.toLowerCase())) {
                        countWords.put(word, countWords.get(word) + 1);
                    } else if (targetWords.contains(word.toLowerCase())) {
                        countWords.put(word, 1);
                    }
                }
                inputLine = bu.readLine();
            }

            LinkedHashMap<String, Integer> sortedKeyMaterials = countWords.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            for (String s : sortedKeyMaterials.keySet()) {
                fw.write(s + " - " + sortedKeyMaterials.get(s));
                fw.write(System.getProperty( "line.separator" ));
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
