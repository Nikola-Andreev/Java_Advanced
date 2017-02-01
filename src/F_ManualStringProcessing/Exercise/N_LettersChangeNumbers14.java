package F_ManualStringProcessing.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N_LettersChangeNumbers14 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split("\\s+");
        Double sum = 0.0;
        Character[] alphabet = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (String anInput : input) {
            Character first = anInput.charAt(0);
            Character last = anInput.charAt(anInput.length() - 1);
            Double number = Double.parseDouble(anInput.substring(1, anInput.length() - 1));
            if (Character.isUpperCase(first)) {
                number = number / Arrays.asList(alphabet).indexOf(Character.toLowerCase(first));
            } else {
                number = number * Arrays.asList(alphabet).indexOf(Character.toLowerCase(first));
            }
            if (Character.isUpperCase(last)) {
                number = number - Arrays.asList(alphabet).indexOf(Character.toLowerCase(last));
            } else {
                number = number + Arrays.asList(alphabet).indexOf(Character.toLowerCase(last));
            }
            sum+=number;
        }

        System.out.printf("%.2f",sum);
    }
}
