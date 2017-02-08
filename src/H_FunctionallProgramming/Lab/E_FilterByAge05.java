package H_FunctionallProgramming.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class E_FilterByAge05 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());
        LinkedHashMap<String, Integer> store = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = scan.readLine().split("[, ]+");
            store.put(input[0], Integer.valueOf(input[1]));
        }

        String condition = scan.readLine();
        int age = Integer.parseInt(scan.readLine());
        String nameOrAge = scan.readLine();

        Predicate<Integer> tester = createTester(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(nameOrAge);
        printFilteredStudent(store, tester, printer);
    }

    private static Consumer<Map.Entry<String,Integer>> createPrinter(String format) {
        switch (format) {
            case "name age":
                return person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
            case "name":
                return person -> System.out.printf("%s%n", person.getKey());
            case "age":
                return person -> System.out.printf("%d%n", person.getValue());
            default: return  null;
        }
    }

    private static Predicate<Integer> createTester(String condition, Integer age) {
        switch (condition) {
            case "younger":
                return x -> x < age;
            case "older":
                return x -> x >= age;
            default: return  null;
        }
    }

    private static void printFilteredStudent(LinkedHashMap<String, Integer> people, Predicate<Integer> tester,
                                             Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person :
                people.entrySet()) {
            if (tester.test(people.get(person.getKey()))) {
                printer.accept(person);
            }
        }
    }
}
