package C_StackAndQues03.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotatoe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int number = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, input);

        int counter =1;
        while (queue.size() > 1){
            for (int i = 1; i < number; i++) {
                queue.offer(queue.poll());
            }
            if(IsPrime(counter)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            counter++;
        }
        System.out.println("Last is "+queue.poll());

    }

    private static boolean IsPrime(int counter) {
        if(counter == 1){
            return false;
        }

        for (int i = 2; i < counter; i++) {
            if(counter % i == 0){
                return false;
            }
        }
        return true;
    }
}
