package C_StackAndQues03.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotatoe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int number = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, input);

        while (queue.size() > 1){
            for (int i = 1; i < number; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed "+queue.poll());
        }
        System.out.println("Last is "+queue.poll());
    }
}
