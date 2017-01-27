package A_JavaSyntax01.Exercises;

import java.util.Scanner;

public class CalculateExpression04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double pow = (a+b+c)/Math.sqrt(c);
        double result1 = Math.pow((a*a + b*b ) / ((a*a)-(b*b)), pow);
        double result2 = Math.pow(((a*a) + (b*b) - (c*c*c)),a-b);
        double diff = Math.abs(((a+b+c)/3) - ((result1+result2) / 2));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",result1,result2,diff);

    }
}
