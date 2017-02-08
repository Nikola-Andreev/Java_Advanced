package H_FunctionallProgramming.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class D_AddVAT04 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        double[] input = Arrays.stream(scan.readLine().split(", ")).mapToDouble(Double::parseDouble).toArray();
        UnaryOperator<Double> result = num -> num * 1.2;
        System.out.println("Prices with VAT:");
        for (double anInput : input) {
            System.out.println(String.format("%.2f", result.apply(anInput)).replace(".", ","));
        }
    }
}
