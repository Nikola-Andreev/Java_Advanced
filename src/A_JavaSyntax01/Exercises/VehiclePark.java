package A_JavaSyntax01.Exercises;

import java.util.*;

public class VehiclePark {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] inputVehicles = scan.nextLine().split(" ");
        List<String> vehicles = new ArrayList<>();
        for (int i = 0; i < inputVehicles.length; i++) {
            vehicles.add(inputVehicles[i]);
        }
        String request = scan.nextLine();
        int soldCount = 0;

        while (!request.equals("End of customers!")){
            boolean found = false;

            char type = Character.toLowerCase(request.split(" ")[0].charAt(0));
            int seats = Integer.parseInt(request.split(" ")[2]);
            if(vehicles.contains(type+""+seats)){
                System.out.printf("Yes, sold for %d$%n",type * seats);
                int index = vehicles.indexOf(type+""+seats);
                vehicles.remove(index);
                soldCount++;
            } else {
                System.out.println("No");
            }
            request = scan.nextLine();
        }

        System.out.println("Vehicles left: " + Arrays.toString(vehicles.toArray()).replace("[","").replace("]", ""));
        System.out.printf("Vehicles sold: %d%n",soldCount);
    }
}
