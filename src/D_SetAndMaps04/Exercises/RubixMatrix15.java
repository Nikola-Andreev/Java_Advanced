package D_SetAndMaps04.Exercises;

import java.util.*;

public class RubixMatrix15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Integer[][] matrix = new Integer[matrixSize[0]][matrixSize[1]];

        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter++;
            }
        }

        int commands = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < commands; i++) {
            String[] inputTokens = scan.nextLine().split(" ");
            int target = Integer.parseInt(inputTokens[0]);
            String direction = inputTokens[1];
            int count = Integer.parseInt(inputTokens[2]);
            if("left".equals(direction) || "right".equals(direction)){
                if(count > matrix[target].length) {
                    count = count % matrix[target].length;
                }
            } else {
                if(count > matrix.length) {
                    count = count % matrix.length;
                }
            }
            ArrayDeque<Integer> matrixRow = new ArrayDeque<>();
            if("left".equals(direction) ){ //row
                Collections.addAll(matrixRow, matrix[target]);
                for (int j = 0; j < count; j++) {
                    int value = matrixRow.pop();
                    matrixRow.addLast(value);
                }
                for (int j = 0; j < matrix[target].length; j++) {
                    matrix[target][j] = matrixRow.pop();
                }
            } else if("right".equals(direction)) {
                Collections.addAll(matrixRow, matrix[target]);
                for (int j = 0; j < count; j++) {
                    int value = matrixRow.pollLast();
                    matrixRow.push(value);
                }
                for (int j = 0; j < matrix[target].length; j++) {
                    matrix[target][j] = matrixRow.pop();
                }
            } else if ("down".equals(direction)){ //column
                for (Integer[] aMatrix : matrix) {
                    matrixRow.addLast(aMatrix[target]);
                }
                for (int j = 0; j < count; j++) {
                    int value = matrixRow.pollLast();
                    matrixRow.push(value);
                }
                for (int j = 0; j < matrix[target].length; j++) {
                    matrix[j][target] = matrixRow.pop();
                }
            } else if ("up".equals(direction)){ //column
                for (Integer[] aMatrix : matrix) {
                    matrixRow.addLast(aMatrix[target]);
                }
                for (int j = 0; j < count; j++) {
                    int value = matrixRow.pop();
                    matrixRow.addLast(value);
                }
                for (int j = 0; j < matrix[target].length; j++) {
                    matrix[j][target] = matrixRow.poll();
                }
            }
        }

        counter = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            List<Integer> list = Arrays.asList(matrix[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                if(counter != matrix[i][j]){
                    if(list.contains(counter)){
                        int index = list.indexOf(counter);
                        result.append("Swap (").append(i).append(", ").append(j).append(") with (").append(i).append(", ").append(index).append(")\n");
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][index];
                        matrix[i][index] = temp;
                    } else {
                        for (int k = 0; k < matrix.length; k++) {
                            List<Integer> tempList = Arrays.asList(matrix[k]);
                            if(tempList.contains(counter)){
                                int index = tempList.indexOf(counter);
                                result.append("Swap (").append(i).append(", ").append(j).append(") with (").append(k).append(", ").append(index).append(")\n");
                                int temp = matrix[i][j];
                                matrix[i][j] = matrix[k][index];
                                matrix[k][index] = temp;
                                break;
                            }
                        }
                    }
                } else {
                    result.append("No swap required\n");
                }
                counter++;
            }
        }
        System.out.println(result);
    }
}
