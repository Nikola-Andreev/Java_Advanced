package A_JavaSyntax01.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbers07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BigInteger product = new BigInteger("1");

        for (int i = n; i <= m; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }

        System.out.printf("product[%d..%d] = %d", n,m,product);
    }
}
