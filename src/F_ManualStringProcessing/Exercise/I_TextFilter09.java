package F_ManualStringProcessing.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_TextFilter09 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] bannedWords = scan.readLine().split(", ");
        String text = scan.readLine();

        for (String bannedWord : bannedWords) {
            while (text.contains(bannedWord)) {
                text = text.replace(bannedWord, new String(new char[bannedWord.length()]).replace("\0", "*"));
            }
        }

        System.out.println(text);
    }
}
