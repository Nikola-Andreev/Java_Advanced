package F_ManualStringProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class D_ConvertBase10toBaseN04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String result = convert(new BigInteger(input[1]), new BigInteger(input[0]));
        System.out.println(result);
    }

    private static String convert(BigInteger number, BigInteger base) {
        BigInteger quotient = number.divide(base);
        BigInteger remainder = number.remainder(base);

        if (quotient.equals(new BigInteger("0"))) {
            return remainder+"";
        } else {
            return convert(quotient, base) + remainder+"";
        }
    }
}
