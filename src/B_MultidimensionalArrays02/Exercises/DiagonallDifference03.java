package B_MultidimensionalArrays02.Exercises;

import java.util.Scanner;

public class DiagonallDifference03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String[][] matrix = new String[number][number];
        for (int i = 0; i < number; i++) {
            matrix[i] = scan.nextLine().split(" ");
        }

        int first = 0;
        int second = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i == j){
                    first += Integer.parseInt(matrix[i][j]);
                }
                if(j + i == number-1){
                    second += Integer.parseInt(matrix[i][j]);
                }
            }
        }
        System.out.println(Math.abs(first-second));
    }
}
