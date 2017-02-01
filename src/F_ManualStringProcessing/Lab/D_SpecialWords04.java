package F_ManualStringProcessing.Lab;

import java.util.HashMap;
import java.util.Scanner;

public class D_SpecialWords04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] keyWords = scan.nextLine().split(" ");
        String[] inputText = scan.nextLine().split(" ");
        HashMap<String, Integer> store = new HashMap<>();

        for (String keyWord1 : keyWords) {
            store.put(keyWord1, 0);
        }

        for (String keyWord : keyWords) {
            for (String anInputText : inputText) {
                if (keyWord.equals(anInputText)) {
                    store.put(keyWord, store.get(keyWord) + 1);
                }
            }
        }

        for (String s : store.keySet()) {
            System.out.println(s + " - " + store.get(s));
        }
    }
}
