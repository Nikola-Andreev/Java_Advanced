package D_SetAndMaps04.Exercises;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();

        while (true){
            String input = scan.nextLine();
            if("search".equals(input)){
                break;
            }
            String[] nameAndPhone = input.split("-");
            phonebook.put(nameAndPhone[0],nameAndPhone[1]);
        }

        while (true){
            String input = scan.nextLine();
            if("stop".equals(input)){
                break;
            }
            if(phonebook.containsKey(input)){
                System.out.println(input + " -> " + phonebook.get(input));
            } else {
                System.out.println("Contact "+ input +" does not exist.");
            }
        }
    }
}
