package B_MultidimensionalArrays02.Exercises;

import java.util.Scanner;

public class SquaresInMatrix04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[0]);
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scan.nextLine().split(" ");
        }

        int counter = 0 ;

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if(matrix[i][j].equals(matrix[i][j+1])){
                    if( matrix[i][j].equals(matrix[i+1][j])) {
                        if(matrix[i][j].equals(matrix[i+1][j+1])) {
                            counter++;
                        }
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
