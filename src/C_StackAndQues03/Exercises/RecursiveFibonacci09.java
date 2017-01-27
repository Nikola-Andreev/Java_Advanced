package C_StackAndQues03.Exercises;

import java.util.Scanner;

public class RecursiveFibonacci09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long number = Long.parseLong(scan.nextLine());

        System.out.println(getFibonacci(number+1));
    }

    private static long getFibonacci(long number) {
        if(number == 0) {
            return 0;
        }
        else if(number == 1) {
            return 1;
        }
        else {
            return getFibonacci(number - 1) + getFibonacci(number - 2);
        }
    }
}
