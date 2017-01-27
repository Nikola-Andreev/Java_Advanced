package B_MultidimensionalArrays02.Exercises;

import java.util.Scanner;

public class MatrixOfPalindromes02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        char one = 'a';
        char two = 'a';
        char tree = 'a';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(one+""+two+""+tree+" ");
                two++;
            }
            System.out.println();
            one++;
            two = one;
            tree = one;
        }
    }
}
