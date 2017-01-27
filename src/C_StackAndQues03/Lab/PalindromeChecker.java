package C_StackAndQues03.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));
        }

        String reversed = "";
        while (!queue.isEmpty()){
            reversed += queue.pollLast();
        }

        System.out.println(reversed.equals(input));
    }
}
