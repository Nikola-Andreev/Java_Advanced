package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class O_TheBiggestSmallestInteger15 {

    private interface TriFunction<T, T1, T2, T3> {
        T3 apply(T t, T1 y, T2 u);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Integer[] inputNumbers = Arrays.stream(Arrays.stream(scan.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray()).boxed().toArray(Integer[]::new);
        List<Integer> resultList = new ArrayList<>();
        Collections.addAll(resultList, inputNumbers);
        String action = scan.readLine();
        String minMax = action.substring(0, 3);
        String oddEven = action.substring(3);

        Function<List<Integer>, Integer> maxFunc = list -> list.stream().max(Integer::compare).get();
        Function<List<Integer>, Integer> minFunc = list -> list.stream().min(Integer::compare).get();

        TriFunction<Function, List<Integer>, String, String> customFunc = (function, numbers, request) -> {
            int remainder = request.equals("Odd") ? 1 : 0;
            numbers = numbers.stream().filter(e -> e % 2 == remainder).collect(Collectors.toList());
            return numbers.size() > 0 ? function.apply(numbers).toString() : null;
        };

        String number = minMax.equals("max") ? customFunc.apply(maxFunc, resultList, oddEven) : customFunc.apply(minFunc, resultList, oddEven);
        System.out.print(number != null ? number : "");
    }
}