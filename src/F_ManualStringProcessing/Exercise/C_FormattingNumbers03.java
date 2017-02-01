package F_ManualStringProcessing.Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C_FormattingNumbers03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("0.000");

        System.out.print("|" + Integer.toHexString(a).toUpperCase() + new String(new char[10 - Integer.toHexString(a).length()]).replace("\0", " "));
        System.out.print("|" + new String(new char[10 - Math.min(Integer.toBinaryString(a).length(),10)]).replace("\0", "0") +
                Integer.toBinaryString(a).substring(0, Math.min(Integer.toBinaryString(a).length(), 10)));
        System.out.print("|" + new String(new char[10 - df.format(b).length()]).replace("\0", " ") + df.format(b));
        System.out.println("|" + df2.format(c) + new String(new char[10 - df2.format(c).length()]).replace("\0", " ") + "|");
    }
}
