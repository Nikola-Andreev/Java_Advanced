package B_MultidimensionalArrays02.Exercises;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[0]);
        String[][] matrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = scan.nextLine().split(" ");
        }

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[i].length-2; j++) {
                int tempSum = Integer.parseInt(matrix[i][j]) + Integer.parseInt(matrix[i][j+1]) + Integer.parseInt(matrix[i][j+2]) +
                        Integer.parseInt(matrix[i+1][j]) + Integer.parseInt(matrix[i+1][j+1]) + Integer.parseInt(matrix[i+1][j+2])+
                        Integer.parseInt(matrix[i+2][j]) + Integer.parseInt(matrix[i+2][j+1]) + Integer.parseInt(matrix[i+2][j+2]);

                if(tempSum > maxSum){
                    startRow = i;
                    startCol = j;
                    maxSum = tempSum;
                }
            }
        }

        System.out.println("Sum = "+maxSum);
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
