package A_JavaSyntax01.Exercises;

import java.util.Scanner;

public class HitTheTarget08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if(i+j == number){
                    System.out.printf("%d + %d = %d%n",i,j,number);
                }
                if(j-i == number){
                    System.out.printf("%d - %d = %d%n",j,i,number);
                }
            }
        }
    }
}
