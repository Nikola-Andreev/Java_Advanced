package A_JavaSyntax01.Lab;

import java.util.Scanner;

public class Greeting04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();

        if(firstName.isEmpty()){
            firstName = "*****";
        }
        if(lastName.isEmpty()){
            lastName = "*****";
        }

        System.out.printf("Hello, %s %s!",firstName,lastName);
    }
}
