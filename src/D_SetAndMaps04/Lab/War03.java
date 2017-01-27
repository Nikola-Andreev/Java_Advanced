package D_SetAndMaps04.Lab;

import java.util.*;

public class War03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedHashSet<Integer> p1Cards = new LinkedHashSet<>();
        LinkedHashSet<Integer> p2Cards = new LinkedHashSet<>();
        for (int i = 0; i < 20; i++) {
            int number = scan.nextInt();
            if(!p1Cards.contains(number)) {
                p1Cards.add(number);
            }
        }
        for (int i = 0; i < 20; i++) {
            int number = scan.nextInt();
            if(!p2Cards.contains(number)) {
                p2Cards.add(number);
            }
        }
        int p1Points = 0;
        int p2Points = 0;

        for (int i = 0; i < 50; i++) {

            if(!p1Cards.isEmpty() && !p2Cards.isEmpty()) {
                int p1 = p1Cards.iterator().next();
                int p2 = p2Cards.iterator().next();
                p1Cards.remove(p1);
                p2Cards.remove(p2);

                if(p1 > p2){
                    p1Points++;
                    if(!p1Cards.contains(p1)) {
                        p1Cards.add(p1);
                    }
                    if(!p1Cards.contains(p2)) {
                        p1Cards.add(p2);
                    }
                } else if (p2 > p1) {
                    p2Points++;
                    if(!p2Cards.contains(p2)) {
                        p2Cards.add(p2);
                    }
                    if(!p2Cards.contains(p1)) {
                        p2Cards.add(p1);
                    }
                }
            } else {
                break;
            }
        }

        if(p1Points > p2Points){
            System.out.println("First player win!");
        } else if(p2Points > p1Points){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
