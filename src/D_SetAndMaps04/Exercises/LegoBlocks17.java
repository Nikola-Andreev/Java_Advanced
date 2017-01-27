package D_SetAndMaps04.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class LegoBlocks17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String[][] matrix1 = new String[number][];
        String[][] matrix2 = new String[number][];
        int counter = 0;

        for (int i = 0; i < number; i++) {
            String input1 = scan.nextLine().trim();
            matrix1[i] = input1.split(" +");
            counter += matrix1[i].length;
        }

        for (int i = 0; i < number; i++) {
            String input2 = scan.nextLine().trim();
            matrix2[i] = input2.split(" +");
            counter += matrix2[i].length;
        }

        boolean found = false;
        int target = matrix1[0].length + matrix2[0].length;

        for (int i = 1; i < matrix2.length; i++) {
            int value = matrix1[i].length + matrix2[i].length;
            if(value != target){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("The total number of cells is: " + counter);
        } else {
            for (int i = 0; i < matrix1.length; i++) {
                String[] arr1 = matrix1[i];
                List<String> arr2 = Arrays.asList(matrix2[i]);
                Collections.reverse(arr2);
                String[] both = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2.toArray())).toArray(String[]::new);
                System.out.println(Arrays.toString(both));
            }
        }
    }
}
