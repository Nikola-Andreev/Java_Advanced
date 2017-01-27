package A_JavaSyntax01.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double quantity = Double.parseDouble(scan.nextLine());
        double pricePerKilo = 1.20;

        BigDecimal priceInLevs = new BigDecimal(pricePerKilo * quantity);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal marksNeeded = exchangeRate.multiply(priceInLevs);

        System.out.printf("%.2f marks", marksNeeded);
    }
}
