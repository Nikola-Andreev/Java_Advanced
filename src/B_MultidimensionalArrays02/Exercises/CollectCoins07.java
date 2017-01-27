package B_MultidimensionalArrays02.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectCoins07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> matrix = new ArrayList<>();
        matrix.add(scan.nextLine());
        matrix.add(scan.nextLine());
        matrix.add(scan.nextLine());
        matrix.add(scan.nextLine());
        String directions = scan.nextLine();

        int r = 0,c = 0, hitWalls = 0,coins = 0;

        if(matrix.get(0).charAt(0) == '$'){
            coins++;
        }

        for (int i = 0; i < directions.length(); i++) {
            if(directions.charAt(i) == '>'){
                if(c < matrix.get(r).length()-1 ){
                    c++;
                    if (matrix.get(r).charAt(c) == '$'){
                        String newStr = matrix.get(r).substring(0,c)+' '+matrix.get(r).substring(c+1);
                        matrix.set(r,newStr);
                        coins++;
                    }
                } else {
                    hitWalls++;
                }
            } else if(directions.charAt(i) == '<'){
                if(c > 0){
                    c--;
                    if (matrix.get(r).charAt(c) == '$'){
                        String newStr = matrix.get(r).substring(0,c)+' '+matrix.get(r).substring(c+1);
                        matrix.set(r,newStr);
                        coins++;
                    }
                } else {
                    hitWalls++;
                }
            } else if(directions.charAt(i) == '^'){
                if(r > 0 && c < matrix.get(r-1).length()){
                    r--;
                    if (matrix.get(r).charAt(c) == '$'){
                        String newStr = matrix.get(r).substring(0,c)+' '+matrix.get(r).substring(c+1);
                        matrix.set(r,newStr);
                        coins++;
                    }
                } else {
                    hitWalls++;
                }
            } else if(directions.charAt(i) == 'V'){
                if(r < matrix.size() -1 && c < matrix.get(r+1).length()){
                    r++;
                    if (matrix.get(r).charAt(c) == '$'){
                        String newStr = matrix.get(r).substring(0,c)+' '+matrix.get(r).substring(c+1);
                        matrix.set(r,newStr);
                        coins++;
                    }
                } else {
                    hitWalls++;
                }
            }
        }
        System.out.println("Coins = "+coins);
        System.out.println("Walls = "+hitWalls);
    }
}
