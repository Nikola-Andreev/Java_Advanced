package F_ManualStringProcessing.Exercise;

import java.util.Scanner;

public class F_CountSubstringOccurrences06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String target = scan.nextLine().toLowerCase();

        int counter = 0;
        for (int i = 0; i < text.length() - target.length() + 1; i++) {
            if(text.substring(i, i + target.length()).toLowerCase().equals(target)){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
