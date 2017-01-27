package E_FilesAndStreams05.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D_CountCharacterTypes04 {
    public static void main(String[] args) {

        String in = "C:\\Users\\_NERO_\\Desktop\\test.txt";
        String out = "C:\\Users\\_NERO_\\Desktop\\output.txt";
        long vowels = 0,consonants = 0,punctuation = 0;
        List<Character> vowelsList = new ArrayList<>();
        Collections.addAll(vowelsList, 'a','e','i','o','u');
        List<Character> punctuationList = new ArrayList<>();
        Collections.addAll(punctuationList, '!','?',',','.');

        try (BufferedReader bf = new BufferedReader(new FileReader(in)); FileWriter fw = new FileWriter(out)){
            String line = bf.readLine();
            while (line != null){
                for (int i = 0; i < line.length(); i++) {
                    char character = line.charAt(i);
                    if(vowelsList.contains(character)){
                        vowels++;
                    } else if (punctuationList.contains(character)){
                        punctuation++;
                    } else if (character != ' ') {
                        consonants++;
                    }
                }
                line = bf.readLine();
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Punctuation: " + punctuation);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
