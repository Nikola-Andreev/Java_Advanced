package D_SetAndMaps04.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TargetPractice16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scan.nextLine();
        int[] rowColRadius = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[matrixSize[0]][matrixSize[1]];

        int counter = 0;
        int tempCount = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            if (counter % 2 == 1) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = input.charAt(tempCount++ % input.length()) + "";
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[i][j] = input.charAt(tempCount++ % input.length()) + "";
                }
            }
            counter++;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ((row - rowColRadius[0]) * (row - rowColRadius[0]) + (col - rowColRadius[1]) *
                        (col - rowColRadius[1]) <= rowColRadius[2] * rowColRadius[2]) {
                    matrix[row][col] = " ";
                }
            }
        }

        for (int i = 0; i < matrix[matrix.length-1].length; i++) {
            String temp = "";
            counter = 0;
            for (int j = matrix.length-1; j >= 0; j--) {
                if(" ".equals(matrix[j][i])){
                    counter++;
                } else {
                    temp+=matrix[j][i];
                }
            }
            temp += new String(new char[counter]).replace("\0", " ");
            for (int j = matrix.length-1; j >= 0; j--) {
                matrix[j][i] = temp.charAt(matrix.length - j -1) + "";
            }
        }

        for (String[] aMatrix : matrix) {
            for (String anAMatrix : aMatrix) {
                System.out.print(anAMatrix);
            }
            System.out.println();
        }
    }
}
