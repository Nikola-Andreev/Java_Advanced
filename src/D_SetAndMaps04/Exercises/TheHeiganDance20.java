package D_SetAndMaps04.Exercises;

import java.util.Scanner;

public class TheHeiganDance20 {

    public static  String[][] matrix = new String[15][15];
    private static double playerPoints = 18500.0;
    private static double enemyPoints = 3000000.0;
    private static boolean nextRoundDamage = false;
    private static boolean win = false;
    private static boolean cloudKill = false;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double playerDamage = Double.parseDouble(scan.nextLine());
        byte playerRow = 7;
        byte playerCol = 7;

        while (scan.hasNextLine()){

            String[] enemyAttack = scan.nextLine().split(" ");
            String attackType = enemyAttack[0];
            int targetRow = Integer.parseInt(enemyAttack[1]);
            int targetCol = Integer.parseInt(enemyAttack[2]);
            int enemyDamage = 0;

            enemyPoints -= playerDamage;

            if(nextRoundDamage){
                playerPoints -= 3500;
                if(playerPoints <= 0){
                    cloudKill=true;
                    break;
                }
                nextRoundDamage = false;
            }

            if(enemyPoints <= 0){
                if(nextRoundDamage){
                    playerPoints -= 3500;
                }
                win = true;
                break;
            }

            if("Cloud".equals(attackType)){
                enemyDamage = 3500;
                nextRoundDamage = true;
            } else {
                enemyDamage = 6000;
            }

            fillTargetCells(targetRow, targetCol, "D");

            if("D".equals(matrix[playerRow][playerCol])){
                if(playerRow-1 >= 0  && !"D".equals(matrix[playerRow-1][playerCol])){
                    fillTargetCells(targetRow, targetCol, "");
                    playerRow--;
                    nextRoundDamage = false;
                } else if(playerCol+1 < 15 && !"D".equals(matrix[playerRow][playerCol+1])){
                    fillTargetCells(targetRow, targetCol, "");
                    playerCol++;
                    nextRoundDamage=false;
                } else if(playerRow+1 < 15 && !"D".equals(matrix[playerRow+1][playerCol])){
                    fillTargetCells(targetRow, targetCol, "");
                    playerRow++;
                    nextRoundDamage=false;
                } else if(playerCol-1 >= 0 && !"D".equals(matrix[playerRow][playerCol-1])){
                    fillTargetCells(targetRow, targetCol, "");
                    playerCol--;
                    nextRoundDamage=false;
                } else {
                    playerPoints-=enemyDamage;
                    if(playerPoints <= 0){
                        if(enemyDamage == 3500){
                            cloudKill=true;
                        }
                        break;
                    }
                    fillTargetCells(targetRow, targetCol, "");
                }
            } else {
                nextRoundDamage = false;
            }
        }
        if(win){
            System.out.println("Heigan: Defeated!");
            if(playerPoints > 0) {
                System.out.printf("Player: %.0f%n", playerPoints);
            } else {
                System.out.println(cloudKill ? "Player: Killed by Plague Cloud" : "Player: Killed by Eruption");
            }
            System.out.println("Final position: " + playerRow + ", " + playerCol);
        } else {
            if(enemyPoints > 0) {
                System.out.printf("Heigan: %.2f%n", enemyPoints);
            } else {
                System.out.println("Heigan: Defeated!");
            }
            System.out.println(cloudKill ? "Player: Killed by Plague Cloud" : "Player: Killed by Eruption");
            System.out.println("Final position: " + playerRow + ", " + playerCol);
        }
    }

    private static void fillTargetCells(int targetRow, int targetCol, String filling) {

        if(targetRow-1 >= 0 && targetRow-1 < 15 && targetCol-1 >= 0 && targetCol-1 < 15 ){
            matrix[targetRow-1][targetCol-1] = filling;
        }
        if(targetRow-1 >= 0 && targetRow-1 < 15 && targetCol >= 0 && targetCol < 15 ){
            matrix[targetRow-1][targetCol] = filling;
        }
        if(targetRow-1 >= 0 && targetRow-1 < 15 && targetCol+1 >= 0 && targetCol+1 < 15 ){
            matrix[targetRow-1][targetCol+1] = filling;
        }
        if(targetRow >= 0 && targetRow < 15 && targetCol-1 >= 0 && targetCol-1 < 15 ){
            matrix[targetRow][targetCol-1] = filling;
        }
        if(targetRow >= 0 && targetRow < 15 && targetCol >= 0 && targetCol < 15 ){
            matrix[targetRow][targetCol] = filling;
        }
        if(targetRow >= 0 && targetRow < 15 && targetCol+1 >= 0 && targetCol+1 < 15 ){
            matrix[targetRow][targetCol+1] = filling;
        }
        if(targetRow+1 >= 0 && targetRow+1 < 15 && targetCol-1 >= 0 && targetCol-1 < 15 ){
            matrix[targetRow+1][targetCol-1] = filling;
        }
        if(targetRow+1 >= 0 && targetRow+1 < 15 && targetCol >= 0 && targetCol < 15 ){
            matrix[targetRow+1][targetCol] = filling;
        }
        if(targetRow+1 >= 0 && targetRow+1 < 15 && targetCol+1 >= 0 && targetCol+1 < 15 ){
            matrix[targetRow+1][targetCol+1] = filling;
        }
    }
}
