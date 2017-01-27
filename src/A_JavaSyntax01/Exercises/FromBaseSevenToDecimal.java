package A_JavaSyntax01.Exercises;

import java.util.Scanner;

public class FromBaseSevenToDecimal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        int result = ConvertToDecimal(number);
        System.out.println(result);
    }

    private static int ConvertToDecimal(int number) {

        String numToStr = Integer.toString(number);
        int result = 0;
        int len = numToStr.length()-1;

        for (int i = 0; i < numToStr.length(); i++) {
            int a = Integer.parseInt(Character.toString(numToStr.charAt(i)));
            double b = Math.pow(7,len--);
            result += a * b;
        }

        return result;
    }

}
