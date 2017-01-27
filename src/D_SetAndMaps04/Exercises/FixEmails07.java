package D_SetAndMaps04.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        while (true){
            String name = scan.nextLine();
            if("stop".equals(name)){
                break;
            }
            String email = scan.nextLine();
            String domain = email.substring(email.length()-2,email.length());
            if("bg".equalsIgnoreCase(domain)){
                emails.put(name, email);
            }
        }

        for (String s : emails.keySet()) {
            System.out.println(s + " -> " + emails.get(s));
        }
    }
}
