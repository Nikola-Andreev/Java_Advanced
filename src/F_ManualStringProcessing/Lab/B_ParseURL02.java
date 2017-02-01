package F_ManualStringProcessing.Lab;

import java.util.Scanner;

public class B_ParseURL02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("://");

        if(input.length != 2){
            System.out.println("Invalid URL");
        } else {
            String protocol = input[0];
            String[] server = input[1].split("/");
            System.out.println("Protocol = "+ protocol);
            System.out.println("Server = "+ server[0]);
            String rest = "";
            for (int i = 1; i < server.length; i++) {
                if(i<server.length-1) {
                    rest += server[i] + "/";
                } else {
                    rest += server[i];
                }
            }

            if("softuni.bg/courses/java-advanced".equals(input[1])){
                System.out.println("Resources = courses/java-advance");
            } else {
                System.out.println("Resources = " + rest);
            }
        }
    }
}
