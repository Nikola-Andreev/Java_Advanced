package I_StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class F_FindAndSumIntegers06 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int result = Arrays.stream(scan.readLine().split("\\s+")).filter(n -> isNumber(n)).mapToInt(Integer::parseInt).sum();
        System.out.println(result != 0 ? result : "No match");
    }

    private static boolean isNumber(String n) {
        try{
            Integer.parseInt(n);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
