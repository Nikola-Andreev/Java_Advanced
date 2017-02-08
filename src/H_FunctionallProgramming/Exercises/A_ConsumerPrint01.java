package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class A_ConsumerPrint01 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split(" ");
        Consumer<String> printName = System.out::println;

        for (String anInput : input) {
            printName.accept(anInput);
        }
    }
}
