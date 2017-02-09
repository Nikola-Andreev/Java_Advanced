package I_StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class C_FirstName03 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] names = scan.readLine().split(" ");
        HashSet<Character> letters = new HashSet<>();
        Stream.of(scan.readLine().split("\\s+")).map(s -> s.toLowerCase().charAt(0)).forEach(letters::add);
        Optional<String> first = Arrays.stream(names).filter(name -> letters.contains(name.toLowerCase().charAt(0))).sorted().findFirst();
        System.out.println(first.isPresent() ? first.get() : "No match");
    }
}
