package B_MultidimensionalArrays02.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSnuffing08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scan.nextLine().split(" ");
        }

        String command = scan.nextLine();
        while (!command.equals("END")){
            String[] tokens = command.split(" ");
            if(tokens.length != 5){
                System.out.println("Invalid input!");
            } else {
                String keyWord = tokens[0];
                if(!keyWord.equals("swap")){
                    System.out.println("Invalid input!");
                } else {
                    int row1 = Integer.parseInt(tokens[1]);
                    int col1 = Integer.parseInt(tokens[2]);
                    int row2 = Integer.parseInt(tokens[3]);
                    int col2 = Integer.parseInt(tokens[4]);
                    boolean row1Valid = row1 < matrix.length && row1 >= 0;
                    boolean col1Valid = col1 < matrix[0].length && col1 >= 0;
                    boolean row2Valid = row2 < matrix.length && row2 >= 0;
                    boolean col2Valid = col2 < matrix[0].length && col2 >= 0;
                    if(row1Valid && row2Valid && col1Valid && col2Valid){
                        String temp = matrix[row1][col1];
                        matrix[row1][col1] = matrix[row2][col2];
                        matrix[row2][col2] = temp;
                        for (String[] aMatrix : matrix) {
                            System.out.println(Arrays.toString(aMatrix).replace("[", "").replace("]", "").replace(",", ""));
                        }
                    } else {
                        System.out.println("Invalid input!");
                    }
                }
            }
            command = scan.nextLine();
        }
    }
}
