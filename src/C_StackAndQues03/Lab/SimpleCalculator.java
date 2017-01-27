package C_StackAndQues03.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input);

        while(stack.size() > 1){
            int num = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int num2 = Integer.parseInt(stack.pop());

            if(operator.equals("+")){
                stack.push(Integer.toString(num+num2));
            } else {
                stack.push(Integer.toString(num-num2));
            }
        }

        System.out.println(stack.pop());
    }
}
