package A_JavaSyntax01.Exercises;

import java.util.*;

public class GameOfNames11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        String winner = "";
        int maxPoints = Integer.MIN_VALUE;

        for (int i = 0; i < number; i++) {
            String input = scan.nextLine();
            int score = Integer.parseInt(scan.nextLine());
            for (int j = 0; j < input.length(); j++) {
                int a = input.charAt(j);
                if(a % 2 == 0){
                    score += a;
                } else {
                    score -= a;
                }
            }

            if(score > maxPoints){
                maxPoints = score;
                winner = input;
            }
        }


        System.out.printf("The winner is %s - %d points",winner,maxPoints);
    }
}
