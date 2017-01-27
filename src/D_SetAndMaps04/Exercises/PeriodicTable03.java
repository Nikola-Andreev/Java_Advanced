package D_SetAndMaps04.Exercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();

        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number; i++) {
            Collections.addAll(set, scan.nextLine().split(" "));
        }

        for (String s : set) {
            System.out.print(s+" ");
        }
    }
}
