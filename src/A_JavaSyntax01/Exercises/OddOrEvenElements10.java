package A_JavaSyntax01.Exercises;

import java.util.Scanner;

public class OddOrEvenElements10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String[] input2 = scan.nextLine().split(" ");

        int target = Integer.parseInt(input2[1]);
        int counter = 0;

        if(input2[2].equals("odd")){
            for (int i = 0; i < input.length; i++) {
                int num = Integer.parseInt(input[i]);
                if(num % 2 != 0) {
                    System.out.print(input[i] + " ");
                    counter++;
                    if (counter == target) {
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < input.length; i++) {
                int num = Integer.parseInt(input[i]);
                if(num % 2 == 0) {
                    System.out.print(input[i] + " ");
                    counter++;
                    if (counter == target) {
                        break;
                    }
                }
            }
        }
    }
}