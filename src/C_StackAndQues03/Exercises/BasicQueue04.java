package C_StackAndQues03.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueue04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String[] input1 = scan.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        int numberOfElements = Integer.parseInt(input[0]);
        int pops = Integer.parseInt(input[1]);
        int target = Integer.parseInt(input[2]);

        for (int i = 0; i < numberOfElements; i++) {
            queue.add(input1[i]);
        }

        for (int i = 0; i < pops; i++) {
            queue.poll();
        }

        if(queue.contains(Integer.toString(target))) {
            System.out.println(true);
        } else if(queue.isEmpty()){
            System.out.println(0);
        } else {
            int min = Integer.MAX_VALUE;
            for (String elem: queue) {
                if(Integer.parseInt(elem) < min){
                    min = Integer.parseInt(elem);
                }
            }
            System.out.println(min);
        }

    }
}
