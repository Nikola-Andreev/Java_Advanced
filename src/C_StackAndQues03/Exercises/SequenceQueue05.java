package C_StackAndQues03.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SequenceQueue05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long number = Long.parseLong(scan.nextLine());
        ArrayDeque<Long> queue = new ArrayDeque<>();
        queue.add(number);

        for (int i = 1; i <= 50; i++) {
            System.out.print(queue.getLast()+ " ");
            if(i % 3 == 1){
                queue.addLast(queue.peek() + 1);
            } else if (i % 3 == 2){
                queue.addLast(2 * queue.peek() + 1);
            } else {
                queue.addLast(queue.pop() + 2);
            }
        }
    }
}
