package F_ManualStringProcessing.Exercise;

import java.util.Scanner;

public class B_StringLength02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if(input.length() > 20){
            System.out.println(input.substring(0,21));
        } else {
            System.out.println(input + new String(new char[20-input.length()]).replace("\0", "*"));
        }
    }
}
