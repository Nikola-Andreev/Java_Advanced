package A_JavaSyntax01.Lab;

import java.util.Scanner;

public class ReadInput01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.next("\\w+");
        String word2 = scan.next("\\w+");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.nextLine();
        String thirdWord = scan.nextLine();

        int sum = num1 + num2 + num3;
        System.out.println(word1 + " " + word2 + ' ' + thirdWord +" "+ sum);
    }
}
