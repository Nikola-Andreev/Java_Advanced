package D_SetAndMaps04.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class RadiaoactiveBunnies18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Character[][] matrix = new Character[matrixSize[0]][matrixSize[1]];

        for (int i = 0; i < matrixSize[0]; i++) {
            String input = scan.nextLine();
            for (int j = 0; j < matrixSize[1]; j++) {
                matrix[i][j] = input.charAt(j);
            }
        }

        String directions = scan.nextLine();
        boolean dead = false;
        boolean win = false;
        String output = "";

        for (int k = 0; k < directions.length(); k++) {
            Character direction = directions.charAt(k);
            boolean updatedPlayer = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 'P') {
                        if (direction == 'L') {
                            if (j - 1 < 0) {
                                matrix[i][j] = '.';
                                win = true;
                                output = "won: " + i + " " + j;
                            } else {
                                if(matrix[i][j - 1] == 'B'){
                                    matrix[i][j] = '.';
                                    dead = true;
                                    output = "dead: " + i + " " + (j - 1);
                                } else {
                                    matrix[i][j] = '.';
                                    matrix[i][j - 1] = 'P';
                                }
                            }
                            updatedPlayer = true;
                            break;
                        }
                        if (direction == 'R') {
                            if (j + 1 > matrix[i].length - 1) {
                                matrix[i][j] = '.';
                                win = true;
                                output = "won: " + i + " " + j;
                            } else {
                                if(matrix[i][j + 1] == 'B'){
                                    matrix[i][j] = '.';
                                    dead = true;
                                    output = "dead: " + i + " " + (j + 1);
                                } else {
                                    matrix[i][j] = '.';
                                    matrix[i][j + 1] = 'P';
                                }
                            }
                            updatedPlayer = true;
                            break;
                        }
                        if (direction == 'U') {
                            if (i - 1 < 0) {
                                matrix[i][j] = '.';
                                win = true;
                                output = "won: " + i + " " + j;
                            } else {
                                if(matrix[i - 1][j] == 'B'){
                                    matrix[i][j] = '.';
                                    dead = true;
                                    output = "dead: " + (i-1) + " " + j;
                                } else {
                                    matrix[i][j] = '.';
                                    matrix[i - 1][j] = 'P';
                                }
                            }
                            updatedPlayer = true;
                            break;
                        }
                        if (direction == 'D') {
                            if (i + 1 > matrix.length - 1) {
                                matrix[i][j] = '.';
                                win = true;
                                output = "won: " + i + " " + j;
                            } else {
                                if(matrix[i + 1][j] == 'B'){
                                    matrix[i][j] = '.';
                                    dead = true;
                                    output = "dead: " + (i+1) + " " + j;
                                } else {
                                    matrix[i][j] = '.';
                                    matrix[i + 1][j] = 'P';
                                }
                            }
                            updatedPlayer = true;
                            break;
                        }
                    }
                }
                if (updatedPlayer){
                    break;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == '.') {
                        continue;
                    } else if (matrix[i][j] == 'B') {
                        if (matrix[Math.max(0, i - 1)][j] == 'P') {
                            output = "dead: " + Math.max(0, i - 1) + " " + j;
                            dead = true;
                        }
                        if (matrix[Math.min(matrix.length - 1, i + 1)][j] == 'P'){
                            output = "dead: " + Math.min(matrix.length - 1, i + 1) + " " + j;
                            dead = true;
                        }
                        if(matrix[Math.max(0, i - 1)][j] != 'B') {
                            matrix[Math.max(0, i - 1)][j] = 'b';
                        }
                        if(matrix[Math.min(matrix.length - 1, i + 1)][j] != 'B') {
                            matrix[Math.min(matrix.length - 1, i + 1)][j] = 'b';
                        }
                        if (matrix[i][Math.min(j + 1, matrix[i].length - 1)] == 'P') {
                            output = "dead: " + i + " " + Math.min(j + 1, matrix[i].length - 1);
                            dead = true;
                        }
                        if(matrix[i][Math.max(0, j - 1)] == 'P'){
                            output = "dead: " + i + " " + Math.max(0, j - 1);
                            dead = true;
                        }
                        if(matrix[i][Math.min(j + 1, matrix[i].length - 1)] != 'B') {
                            matrix[i][Math.min(j + 1, matrix[i].length - 1)] = 'b';
                        }
                        if(matrix[i][Math.max(0, j - 1)] != 'B') {
                            matrix[i][Math.max(0, j - 1)] = 'b';
                        }
                    } else if (matrix[i][j] == 'b') {
                        matrix[i][j] = 'B';
                    }
                }
                for (int j = 0; j < matrix[i].length; j++) {
                    if(i-1 >= 0) {
                        matrix[i-1][j] = Character.toUpperCase(matrix[i-1][j]);
                    }
                    matrix[i][j] = Character.toUpperCase(matrix[i][j]);
                }
            }
            if (dead || win) {
                break;
            }
        }
        for (Character[] aMatrix : matrix) {
            System.out.println(Arrays.toString(aMatrix).replace("[", "").replace("]", "").replace(",", "").replace(" ", "").toUpperCase());
        }
        System.out.println(output);
    }
}
