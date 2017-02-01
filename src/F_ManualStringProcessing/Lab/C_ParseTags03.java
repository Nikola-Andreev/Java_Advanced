package F_ManualStringProcessing.Lab;

import java.util.Scanner;

public class C_ParseTags03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (input.contains("<upcase>")){
            int start = input.indexOf("<upcase>");
            int end = input.indexOf("</upcase>");
            String subs = input.substring(start + 8, end);
            input = input.replace("<upcase>" + subs + "</upcase>", subs.toUpperCase());
        }
        System.out.println(input);
    }
}
