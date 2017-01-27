package B_MultidimensionalArrays02.Lab;

import java.util.Scanner;

public class MaxSumof2x2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = scan.nextLine().split(", ");
        }

        int bestSum = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                int tempSum = Integer.parseInt(matrix[i][j]) + Integer.parseInt(matrix[i][j+1]);
                tempSum +=  Integer.parseInt(matrix[i+1][j]) + Integer.parseInt(matrix[i+1][j+1]);
                if(tempSum > bestSum){
                    bestSum = tempSum;
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(matrix[row][col]+" "+matrix[row][col+1]);
        System.out.println(matrix[row+1][col]+" "+matrix[row+1][col+1]);
        System.out.println(bestSum);
    }
}
