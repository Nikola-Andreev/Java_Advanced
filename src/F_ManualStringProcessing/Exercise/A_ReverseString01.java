package F_ManualStringProcessing.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_ReverseString01 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new StringBuilder(scan.readLine()).reverse().toString());
    }
}
