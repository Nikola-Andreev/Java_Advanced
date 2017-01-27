package B_MultidimensionalArrays02;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        String password = console.nextLine();
        String truePassword = "s3cr3t!P@ssw0rd";

        if(password.equals(truePassword)){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
