package A_JavaSyntax01.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlurFilter13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        String[] input = scan.nextLine().split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for (String anInput : input) {
            list.add(Integer.parseInt(anInput));
        }
        long[][] matrix = new long[list.get(0)][list.get(1)];
        for (int row = 0; row < list.get(0); row++)
        {
            String[] input2 = scan.nextLine().split(" ");
            List<Integer> cells = new ArrayList<Integer>();
            for (String anInput : input2) {
                cells.add(Integer.parseInt(anInput));
            }
            for (int col = 0; col < list.get(1); col++) {
                matrix[row][col] = cells.get(col);
            }
        }
        String[] input3 = scan.nextLine().split(" ");
        List<Integer> target = new ArrayList<Integer>();
        for (String anInput : input3) {
            target.add(Integer.parseInt(anInput));
        }
        for (int r = 0; r < list.get(0); r++) {
            for (int col = 0; col < list.get(1); col++) {
                if (target.get(0)==r-1) {
                    if (target.get(1)==col-1 || target.get(1)==col || target.get(1)==col+1) {
                        matrix[r][col] += a;
                    }
                }
                if (target.get(0) == r ) {
                    if (target.get(1) == col - 1 || target.get(1) == col || target.get(1) == col + 1) {
                        matrix[r][col] += a;
                    }
                }
                if (target.get(0) == r + 1) {
                    if (target.get(1) == col - 1 || target.get(1) == col || target.get(1) == col + 1) {
                        matrix[r][col] += a;
                    }
                }
            }
        }
        for (int rows = 0; rows < list.get(0); rows++) {
            for (int cols = 0; cols < list.get(1); cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
