package A_JavaSyntax01.Exercises;

import java.util.Scanner;

public class FromDecimalToBase7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        int result = ConvertToBase7(number);
        System.out.println(result);
    }

    private static int ConvertToBase7(int number) {

        String result = "";
        String numToStr = Integer.toString(number);
        Integer[] arr = {1,7,49,343,2401,16807,117649};
        int target = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] <= number ){
                target = i;
                break;
            }
        }

        for (int i = target; i >= 0; i--) {
             result += number / arr[i];
             number = number % arr[i];
        }
        return Integer.parseInt(result);
    }
}
