package F_ManualStringProcessing.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class K_Palindromes11 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] inputText = scan.readLine().split("[ ,.?!]");
        TreeSet<String> store = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        for (String anInputText : inputText) {
            String reversed = new StringBuilder(anInputText).reverse().toString();
            if (anInputText.equals(reversed) && !anInputText.equals("")) {
                store.add(anInputText);
            }
        }

        System.out.println(store);
    }
}
