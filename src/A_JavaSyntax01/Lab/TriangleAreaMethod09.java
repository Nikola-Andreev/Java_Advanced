package A_JavaSyntax01.Lab;

import java.util.Scanner;

public class TriangleAreaMethod09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double base = scan.nextDouble();
        double height = scan.nextDouble();

        double result = CalcArea(base,height);
        System.out.printf("Area = %.2f",result);
    }

    private static double CalcArea(double base, double height) {
        return  (base * height) / 2;
    }
}
