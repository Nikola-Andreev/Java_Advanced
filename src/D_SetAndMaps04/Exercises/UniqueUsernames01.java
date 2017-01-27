package D_SetAndMaps04.Exercises;

import java.util.*;

public class UniqueUsernames01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedHashSet<String> names = new LinkedHashSet<>();
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            String input = scan.nextLine();
            names.add(input);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
