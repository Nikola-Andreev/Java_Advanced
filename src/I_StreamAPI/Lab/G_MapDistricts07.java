package I_StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G_MapDistricts07 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, List<Integer>> store = new HashMap<>();
        List<String> input = Arrays.asList(scan.readLine().split("\\s+"));
        int targetPopulation = Integer.valueOf(scan.readLine());

        for (String anInput : input) {
            String[] tokens = anInput.split(":");
            store.putIfAbsent(tokens[0], new ArrayList<>());
            store.get(tokens[0]).add(Integer.parseInt(tokens[1]));
        }

        store.entrySet().stream()
                .filter(kv -> kv.getValue().stream().mapToInt(Integer::valueOf).sum() > targetPopulation)
                .sorted((kvp1, kvp2) -> Integer.compare(
                        kvp2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        kvp1.getValue().stream().mapToInt(Integer::valueOf).sum()))
                .forEach(kv -> {
                    System.out.print(kv.getKey() + ": " );
                    kv.getValue().stream().sorted((a, b) -> b.compareTo(a)).limit(5).forEach(val -> System.out.print(val + " "));
                    System.out.println();
                });
    }
}

