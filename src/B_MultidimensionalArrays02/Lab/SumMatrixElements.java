package B_MultidimensionalArrays02.Lab;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            matrix[i] = scan.nextLine().split(", ");
            for (int j = 0; j < matrix[i].length; j++) {
                sum += Integer.parseInt(matrix[i][j]);
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
