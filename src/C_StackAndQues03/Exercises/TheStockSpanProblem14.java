package C_StackAndQues03.Exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TheStockSpanProblem14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int[] stock = new int[number];
        for (int i = 0; i < stock.length; i++) {
            stock[i] = Integer.parseInt(scan.nextLine());
        }

        Deque<Integer> st = new ArrayDeque<>();
        st.push(0);
        StringBuilder builder = new StringBuilder();
        builder.append(1).append("\n");
        for (int i = 1; i < number; i++) {
            while (!st.isEmpty() && stock[st.peek()] <= stock[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                builder.append(i - st.peek()).append("\n");
            } else {
                builder.append(i + 1).append("\n");
            }
            st.push(i);
        }

        System.out.println(builder.toString());
    }
}