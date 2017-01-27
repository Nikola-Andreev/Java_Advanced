package C_StackAndQues03.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String anInput : input) {
            stack.push(anInput);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
