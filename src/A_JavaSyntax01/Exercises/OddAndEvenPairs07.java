package A_JavaSyntax01.Exercises;

import java.util.Scanner;

public class OddAndEvenPairs07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");

        if(numbers.length % 2 == 1){
            System.out.println("invalid length");
        } else {
            for (int i = 0; i < numbers.length; i += 2) {

                int a = Integer.parseInt(numbers[i]);
                int b = Integer.parseInt(numbers[i+1]);

                if (a % 2 == 0 && b % 2 == 0) {
                    System.out.printf("%d, %d -> both are even%n", a, b);
                } else if (a % 2 == 1 && b % 2 == 1) {
                    System.out.printf("%d, %d -> both are odd%n", a, b);
                } else {
                    System.out.printf("%d, %d -> different%n", a, b);
                }
            }
        }
    }
}
