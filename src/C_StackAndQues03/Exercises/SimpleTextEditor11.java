package C_StackAndQues03.Exercises;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Stack<String> lastStrings=new Stack<String>();
        String currentString = "";
        lastStrings.push(currentString);
        for (int i = 0; i < n; i++)
        {
            String[] currentCommand = scan.nextLine().split(" ");
            switch (currentCommand[0])
            {
                case "1": {
                    currentString += currentCommand[1];
                    lastStrings.push(currentString);
                }
                break;
                case "2": {
                    int countOfLastEl = Integer.parseInt(currentCommand[1]);
                    StringBuilder str = new StringBuilder();
                    currentString = currentString.substring(0, currentString.length() - countOfLastEl);
                    lastStrings.push(currentString);
                }
                break;
                case "3": {
                    int indexForPrint = Integer.parseInt(currentCommand[1]);
                    System.out.println(currentString.charAt(indexForPrint - 1));
                }
                break;
                case "4": {
                    lastStrings.pop();
                    currentString = lastStrings.peek();
                }
                break;
            }
        }
    }
}
