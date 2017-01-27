package A_JavaSyntax01.Lab;

import java.util.Scanner;

public class TransportPrice05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Double distance = Double.parseDouble(scan.nextLine());
        String daytime = scan.nextLine();
        double result = 0;

        if(distance >= 100){
            result = distance * 0.06;
        } else if(distance >= 20){
            result = distance * 0.09;
        } else {
            if(daytime.equals("day")){
                result = distance * 0.79;
            } else {
                result = distance * 0.9;
            }
            result += 0.7;
        }

        System.out.printf("%.2f",result);
    }
}
