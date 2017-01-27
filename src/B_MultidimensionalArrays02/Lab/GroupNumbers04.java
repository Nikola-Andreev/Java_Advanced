package B_MultidimensionalArrays02.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GroupNumbers04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        List<String> zero = new ArrayList<>();
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if(num % 3 == 0){
                zero.add(input[i]);
            } else if(Math.abs(num % 3) == 1){
                one.add(input[i]);
            } else {
                two.add(input[i]);
            }
        }

        System.out.println(Arrays.toString(zero.toArray()).replace("[","").replace("]","").replace(",",""));
        System.out.println(Arrays.toString(one.toArray()).replace("[","").replace("]","").replace(",",""));
        System.out.println(Arrays.toString(two.toArray()).replace("[","").replace("]","").replace(",",""));

    }
}
