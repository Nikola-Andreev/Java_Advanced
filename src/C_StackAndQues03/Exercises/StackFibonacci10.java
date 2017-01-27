package C_StackAndQues03.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackFibonacci10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long number = Long.parseLong(scan.nextLine());
        ArrayDeque<Long> fibonacci = new ArrayDeque<>();
        fibonacci.add((long)1);
        fibonacci.add((long)1);

        for (int i = 1; i < number; i++) {
            long x = fibonacci.pop();
            long y = fibonacci.pop();
            long z = x + y;
            fibonacci.push(y);
            fibonacci.push(x);
            fibonacci.push(z);
        }

        System.out.println(fibonacci.pop());
    }
}
