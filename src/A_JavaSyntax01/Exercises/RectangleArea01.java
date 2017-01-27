package A_JavaSyntax01.Exercises;

import java.util.Scanner;

public class RectangleArea01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        System.out.printf("%.2f",number1*number2);
    }
}
