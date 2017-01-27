package D_SetAndMaps04.Exercises;

import java.util.*;

public class HandsOfCards08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, HashSet<String>> playersScore = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if ("JOKER".equals(input)) {
                break;
            }
            HashSet<String> uniqueCards = new HashSet<>();
            String[] nameAndCards = input.split(":");
            String name = nameAndCards[0];
            String[] cards = nameAndCards[1].trim().split(", ");
            Collections.addAll(uniqueCards, cards);

            if (!playersScore.containsKey(name)) {
                playersScore.put(name, uniqueCards);
            } else {
                for (String uniqueCard : uniqueCards) {
                    if (!playersScore.get(name).contains(uniqueCard)) {
                        playersScore.get(name).add(uniqueCard);
                    }
                }
            }
        }

        for (String s : playersScore.keySet()) {
            int sum = 0;
            for (String uniqueCard : playersScore.get(s)) {
                sum += getCardValue(uniqueCard);
            }
            System.out.println(s + ": " + sum);
        }

    }

    private static int getCardValue(String uniqueCard) {
        Character value = uniqueCard.charAt(0);
        Character power = uniqueCard.charAt(uniqueCard.length() - 1);
        int v = 0;
        int p = 0;
        switch (value) {
            case '2':
                v = 2;
                break;
            case '3':
                v = 3;
                break;
            case '4':
                v = 4;
                break;
            case '5':
                v = 5;
                break;
            case '6':
                v = 6;
                break;
            case '7':
                v = 7;
                break;
            case '8':
                v = 8;
                break;
            case '9':
                v = 9;
                break;
            case '1':
                v = 10;
                break;
            case 'J':
                v = 11;
                break;
            case 'Q':
                v = 12;
                break;
            case 'K':
                v = 13;
                break;
            case 'A':
                v = 14;
                break;
            default:
                v = 1;
                break;
        }
        switch (power) {
            case 'S':
                p = 4;
                break;
            case 'H':
                p = 3;
                break;
            case 'D':
                p = 2;
                break;
            case 'C':
                p = 1;
                break;
            default:
                p = 1;
                break;
        }
        return v * p;
    }
}
