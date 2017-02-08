package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class B_KnightsOfHoner02 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split("\\s+");
        Consumer<String> printName = name -> System.out.println("Sir " + name);

        for (String s : input) {
            printName.accept(s);
        }
    }
}
