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
                case "print":System.out.println(Arrays.toString(inputNumbers).replace("]","").replace("[","").replace(",",""));break;
                case "add": inputNumbers = Arrays.stream(inputNumbers).map(a -> a + 1 ).toArray();break;
                case "multiply" : inputNumbers = Arrays.stream(inputNumbers).map(a -> a * 2 ).toArray();break;
                case "subtract" : inputNumbers = Arrays.stream(inputNumbers).map(a -> a - 1 ).toArray();break;
            }
        }
    }
}
