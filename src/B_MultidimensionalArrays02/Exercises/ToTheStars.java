package B_MultidimensionalArrays02.Exercises;

import java.util.Scanner;

public class ToTheStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] star1 = scan.nextLine().split(" ");
        String[] star2 = scan.nextLine().split(" ");
        String[] star3 = scan.nextLine().split(" ");
        String[] normandyCordinates = scan.nextLine().split(" ");
        int moves = Integer.parseInt(scan.nextLine());
        double shipCol = Double.parseDouble(normandyCordinates[0]);
        double shipRow = Double.parseDouble(normandyCordinates[1]);

        String firstStarName = star1[0];
        double firstStarRow = Double.parseDouble(star1[2]);
        double firstStarCol = Double.parseDouble(star1[1]);

        String secondStarName = star2[0];
        double secondStarRow = Double.parseDouble(star2[2]);
        double secondStarCol = Double.parseDouble(star2[1]);

        String thirdStarName = star3[0];
        double thirdStarRow = Double.parseDouble(star3[2]);
        double thirdStarCol = Double.parseDouble(star3[1]);

        for (int i = 0; i <= moves; i++) {
            if (Math.abs(shipRow - firstStarRow) <= 1 && Math.abs(shipCol - firstStarCol) <= 1) {
                System.out.println(firstStarName.toLowerCase());
            } else if (Math.abs(shipRow - secondStarRow) <= 1 && Math.abs(shipCol - secondStarCol) <= 1) {
                System.out.println(secondStarName.toLowerCase());
            } else if (Math.abs(shipRow - thirdStarRow) <= 1 && Math.abs(shipCol - thirdStarCol) <= 1) {
                System.out.println(thirdStarName.toLowerCase());
            } else {
                System.out.println("space");
            }
            shipRow++;
        }
    }
}
