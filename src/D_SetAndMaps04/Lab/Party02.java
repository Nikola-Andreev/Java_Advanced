package D_SetAndMaps04.Lab;

import java.util.Scanner;
import java.util.TreeSet;

public class Party02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> guests = new TreeSet<>();

        while (true){
            String input = scan.nextLine();
            if("PARTY".equals(input)){
                break;
            }
            if(input.length() == 8) {
                try {
                    int number = Integer.parseInt(input.substring(0, 1));
                    vip.add(input);
                } catch (Exception e) {
                    guests.add(input);
                }
            }
        }

        while (true){
            String input = scan.nextLine();
            if("END".equals(input)){
                break;
            }
            try{
                int number = Integer.parseInt(input.substring(0,1));
                if(vip.contains(input)) {
                    vip.remove(input);
                }
            } catch (Exception e){
                if(guests.contains(input)) {
                    guests.remove(input);
                }
            }
        }

        System.out.println(vip.size()+guests.size());
        for (String vp: vip){
            System.out.println(vp);
        }
        for (String gu: guests){
            System.out.println(gu);
        }
    }
}
