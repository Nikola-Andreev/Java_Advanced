package H_FunctionallProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class E_AppliedArithmetics05 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumbers = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (true){
            String input = scan.readLine();
            if("end".equals(input)){
                break;
            }
            switch (input){
                case "print":System.out.println(
                        Arrays.toString(inputNumbers).replace("]","").replace("[","").replace(",",""));break;
                case "add": inputNumbers = transformArray(inputNumbers, "+");break;
                case "multiply" : inputNumbers = transformArray(inputNumbers, "*");break;
                case "subtract" : inputNumbers = transformArray(inputNumbers, "-");break;
            }
        }
    }

    private static int[] transformArray(int[] inputNumbers, String s) {
        switch (s){
            case "+": return Arrays.stream(inputNumbers).map(a -> a + 1 ).toArray();
            case "-": return Arrays.stream(inputNumbers).map(a -> a - 1 ).toArray();
            case "*": return Arrays.stream(inputNumbers).map(a -> a * 2 ).toArray();
            default: return null;
        }
    }
}
