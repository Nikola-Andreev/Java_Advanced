package B_MultidimensionalArrays02.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class FillMatrix01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int number = Integer.parseInt(input[0]);
        int[][] matrix = new int[number][number];

        int  counter =1;
        if(input[1].equals("A")) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                        matrix [j][i] = counter++;
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]).replace("[","").replace("]","").replace(",",""));
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if(i%2 == 0) {
                        matrix[j][i] = counter++;
                    } else {
                        matrix[matrix.length-1-j][i] = counter++;
                    }
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]).replace("[","").replace("]","").replace(",",""));
            }
        }
    }
}
