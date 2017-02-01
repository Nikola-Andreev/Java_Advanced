package F_ManualStringProcessing.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L_CharacterMultiplier12 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split(" ");
        if(input[0].length() > input[1].length()){
            System.out.println(MultiplyCharacters(input[0],input[1]));
        } else {
            System.out.println(MultiplyCharacters(input[1],input[0]));
        }
    }

    private static String MultiplyCharacters(String s, String s1) {
        long multiply = 0;
        for (int i = 0; i < s1.length(); i++) {
            multiply += s.charAt(i) * s1.charAt(i);
        }
        for (int i = s1.length(); i < s.length(); i++) {
            multiply += s.charAt(i);
        }
        return multiply+"";
    }
}
