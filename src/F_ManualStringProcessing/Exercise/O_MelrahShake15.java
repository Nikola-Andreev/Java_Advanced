package F_ManualStringProcessing.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O_MelrahShake15 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder(scan.readLine());
        StringBuilder target = new StringBuilder(scan.readLine());

        while (true) {
            int firstIndex = input.indexOf(target + "");
            int lastIndex = input.lastIndexOf(target + "");
            if(firstIndex == lastIndex || "".equals(target+"")){
                System.out.println("No shake.");
                break;
            }
            input = input.replace(firstIndex, firstIndex + target.length(), "");
            input = input.replace(lastIndex-target.length(), lastIndex-target.length() + target.length(), "");
            int indexForRemove = target.length() / 2;
            target = target.replace(indexForRemove, indexForRemove+1, "");
            System.out.println("Shaked it.");
        }

        System.out.println(input);
    }
}
