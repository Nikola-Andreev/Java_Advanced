package D_SetAndMaps04.Exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class ParkingLot21 {
    public static void main(String[] args) throws Exception {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] matrixSize = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, HashMap<Integer, String>> matrix = new HashMap<>();

        while (true) {
            String[] input = scan.readLine().split(" ");
            if ("stop".equals(input[0])) {
                break;
            }

            int rowEntry = Integer.parseInt(input[0]);
            int targetRow = Integer.parseInt(input[1]);
            int targetCol = Integer.parseInt(input[2]);
            int counter = Math.abs(targetRow - rowEntry) + 1;

            if (matrix.containsKey(targetRow) && matrix.get(targetRow).containsKey(targetCol)) {
                boolean found = false;
                int index = 0;
                for (int i = targetCol; i > 0; i--) {
                    if (!matrix.get(targetRow).containsKey(i)) {
                        found = true;
                        index = i;
                        break;
                    }
                }
                for (int i = targetCol; i < matrixSize[1]; i++) {
                    if (!matrix.get(targetRow).containsKey(i)) {
                        if (i - targetCol < targetCol - index || !found) {
                            found = true;
                            index = i;
                            break;
                        }
                    }
                }
                if (!found) {
                    System.out.println("Row "+ targetRow + " full");
                } else {
                    matrix.get(targetRow).put(index, "X");
                    System.out.println(counter + index);
                }
            } else {
                counter += targetCol;
                if(matrix.containsKey(targetRow)){
                    matrix.get(targetRow).put(targetCol, "X");
                } else {
                    HashMap<Integer, String> temp = new HashMap<>();
                    temp.put(targetCol, "X");
                    matrix.put(targetRow, temp);
                }
                System.out.println(counter);
            }
        }
    }
}
