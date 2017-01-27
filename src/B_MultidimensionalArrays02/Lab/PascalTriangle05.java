package B_MultidimensionalArrays02.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        long[][] pascalTriangle = new long[number][];
        int currentWidth = 1;
        for (int currentHeight = 0; currentHeight < number; currentHeight++) {
            pascalTriangle[currentHeight] = new long[currentWidth];
            long[] currentRow = pascalTriangle[currentHeight];
            currentWidth++;
            currentRow[0] = 1;
            currentRow[currentRow.length - 1] = 1;
            if (currentRow.length > 2)
                for (int i = 1; i < currentRow.length - 1; i++) {
                    long[] previousRow = pascalTriangle[currentHeight - 1];
                    long previousRowSum = previousRow[i] + previousRow[i - 1];
                    currentRow[i] = previousRowSum;
                }
        }

        for (int i = 0; i < pascalTriangle.length; i++) {
            System.out.println(Arrays.toString(pascalTriangle[i]).replace("[","").replace("]","").replace(",",""));
        }
    }
}
