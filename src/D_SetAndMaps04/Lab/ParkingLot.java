package D_SetAndMaps04.Lab;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashSet<String> cars = new HashSet<>();

        String input = scan.nextLine();
        while (!input.equals("END")){
            String[] tokens = input.split(", ");
            if(tokens[0].equals("IN")){
                cars.add(tokens[1]);
            } else {
                if(cars.contains(tokens[1])) {
                    cars.remove(tokens[1]);
                }
            }
            input = scan.nextLine();
        }

        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String aList : cars) {
                System.out.println(aList);
            }
        }
    }
}
