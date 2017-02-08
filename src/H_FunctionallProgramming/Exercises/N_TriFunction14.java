package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;

public class N_TriFunction14 {

    private interface TriFunction<T, T1, T2, T3> {
        T3 apply(T t, T1 y, T2 u);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int targetNumber = Integer.parseInt(scan.readLine());
        String[] inputNames = scan.readLine().split("\\s+");

        TriFunction<Integer, BiFunction<String, Integer, Boolean>, String[], String> triFunction = (number, biFunction, collection) -> {
            for (String name : collection) {
                if (biFunction.apply(name, number)) {
                    return name;
                }
            }
            return null;
        };

        BiFunction<String, Integer, Boolean> biFunction = (string, number) -> {
            int sum = 0;
            for (char letter : string.toCharArray()) {
                sum += letter;
            }
            return sum >= number;
        };

        String result = triFunction.apply(targetNumber, biFunction, inputNames);
        System.out.print( result != null ? result : "");
    }
}