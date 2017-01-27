package A_JavaSyntax01.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormattingNumbers03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("0.000");
        String hex = Integer.toHexString(a).toUpperCase();
        String hexSpaces = new String(new char[10 - hex.length()]).replace("\0", " ");
        String binary = Integer.toBinaryString(a);
        String thirdNumber = df.format(b);
        String thirdNumSpaces = new String(new char[10 - thirdNumber.length()]).replace("\0", " ");
        String fourthNumber = df2.format(c);
        String fourthNumSpaces = new String(new char[10 - fourthNumber.length()]).replace("\0", " ");
        if(binary.length() < 11) {
            String zeroes = new String(new char[10 - binary.length()]).replace("\0", "0");
            binary = zeroes + binary;
        }
        System.out.println("|" + hex + hexSpaces + "|" + binary + "|" + thirdNumSpaces + df.format(b) + "|" + fourthNumber + fourthNumSpaces + "|");
    }
}
