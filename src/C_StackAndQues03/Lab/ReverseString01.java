package C_StackAndQues03.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseString01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
