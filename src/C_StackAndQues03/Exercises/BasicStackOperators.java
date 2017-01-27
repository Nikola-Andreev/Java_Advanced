package C_StackAndQues03.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String[] input2 = scan.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        int numberOfElements = Integer.parseInt(input[0]);
        int pops = Integer.parseInt(input[1]);
        int target = Integer.parseInt(input[2]);
        for (int i = 0; i < numberOfElements; i++) {
            stack.push(input2[i]);
        }
        for (int i = 0; i < pops; i++) {
            stack.pop();
        }

        if(stack.contains(Integer.toString(target))) {
            System.out.println(stack.contains(Integer.toString(target)));
        } else if(stack.isEmpty()){
            System.out.println("0");
        } else {
            int minNumber = Integer.MAX_VALUE;
            for (String element: stack) {
                if(Integer.parseInt(element) < minNumber){
                    minNumber = Integer.parseInt(element);
                }
            }
            System.out.println(minNumber);
        }
    }
}
