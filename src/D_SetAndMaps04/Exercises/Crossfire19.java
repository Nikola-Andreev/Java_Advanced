package D_SetAndMaps04.Exercises;

import java.util.*;

public class Crossfire19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[matrixSize[0]][matrixSize[1]];

        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ++counter + "";
            }
        }

        while (true){
            String input = scan.nextLine();
            if("Nuke it from orbit".equals(input)){
                break;
            }
            int targetRow = Integer.parseInt(input.split(" ")[0]);
            int targetCol = Integer.parseInt(input.split(" ")[1]);
            int targetRadius = Integer.parseInt(input.split(" ")[2]);

            //right
            for (int i = targetCol; i < Math.min(matrix[0].length, targetCol+targetRadius+1); i++) {
                if(targetRow >= 0 && targetRow < matrix.length && i >=0 && i < matrix[0].length) {
                    matrix[targetRow][i] = " ";
                }
            }
            //left
            for (int i = targetCol; i >= Math.max(0, targetCol - targetRadius ) ; i--) {
                if(targetRow >= 0 && targetRow < matrix.length && i >=0 && i < matrix[0].length) {
                    matrix[targetRow][i] = " ";
                }
            }
            //up
            for (int i = targetRow; i >= Math.max(0, targetRow - targetRadius) ; i--) {
                if(targetCol >= 0 && targetCol < matrix[0].length && i >=0 && i < matrix.length) {
                    matrix[i][targetCol] = " ";
                }
            }
            //down
            for (int i = targetRow; i < Math.min(matrix.length, targetRow + targetRadius +1) ; i++) {
                if(targetCol >= 0 && targetCol < matrix[0].length && i >=0 && i < matrix.length) {
                    matrix[i][targetCol] = " ";
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                List<String> list = new ArrayList<>();
                Collections.addAll(list, matrix[i]);
                int intervals = 0;
                for (int j = 0; j < list.size(); j++) {
                    if(" ".equals(list.get(j))){
                        intervals++;
                    }
                }

                if(intervals == list.size()) {
                    List<String[]> l = new ArrayList<String[]>(Arrays.asList(matrix));
                    l.remove(i);
                    matrix = l.toArray(new String[][]{});
                    i--;
                } else {
                    list.removeAll(Arrays.asList("", " "));
                    for (int j = 0; j < intervals; j++) {
                        list.add(" ");
                    }
                    String[] newRow = list.toArray(new String[list.size()]);
                    matrix[i] = newRow;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            String row = Arrays.toString(matrix[i]).replace(", ","").replace("[","").replace("]","").replace(" ","");
            if(row.length() > 0) {
                System.out.println(Arrays.toString(matrix[i]).replace("[", "").replace("]", "").replace(",", "").trim());
            }
        }
    }
}
