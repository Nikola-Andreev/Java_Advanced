package D_SetAndMaps04.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        LinkedHashSet<String> set1 = new LinkedHashSet<>();

        for (int i = 0; i < Integer.parseInt(input[0]); i++) {
            String input1 = scan.nextLine();
            set.add(input1);
        }

        for (int i = 0; i < Integer.parseInt(input[1]); i++) {
            String input1 = scan.nextLine();
            set1.add(input1);
        }

        set.retainAll(set1);

        String joined = "";
        joined = String.join(" ", set);

        System.out.println(joined);
    }
}
