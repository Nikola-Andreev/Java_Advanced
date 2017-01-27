package C_StackAndQues03.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class TruckTour07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        ArrayDeque<String[]> allPumps = new ArrayDeque<>();

        for (int i = 0; i < number; i++) {
            allPumps.addLast(scan.nextLine().split(" "));
        }

        int counter = 0;
        while (true) {
            long fuel = 0;
            boolean found = true;
            for (String[] petrolPump : allPumps) {
                long petrol = Integer.parseInt(petrolPump[0]);
                long distance = Integer.parseInt(petrolPump[1]);
                fuel+=petrol;
                if (distance > fuel){
                    found = false;
                    break;
                }
                fuel-=distance;
            }
            if(found){
                System.out.println(counter);
                break;
            }
            String[] pump = allPumps.pop();
            allPumps.addLast(pump);
            counter++;
        }
    }
}
