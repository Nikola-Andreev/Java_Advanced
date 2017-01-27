package B_MultidimensionalArrays02.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class REadSOrtPrint01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String input = scan.nextLine();
            list.add(input);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
