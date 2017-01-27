package B_MultidimensionalArrays02.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PlusRemove10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<List<String>> matrix = new ArrayList<>();
        List<List<String>> matrix2 = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("END")){
            List<String> row = Arrays.asList(input.split(""));
            matrix.add(row);
            List<String> result2 = row.stream().map(String::toUpperCase).collect(Collectors.toList());
            matrix2.add(result2);
            input = scan.nextLine();
        }

        for (int i = 0; i < matrix.size()-2; i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if(j > 0 && matrix.get(i+1).size() > j+1 && matrix.get(i+2).size() > j){
                    if(matrix2.get(i).get(j).equals(matrix2.get(i+1).get(j)) && matrix2.get(i).get(j).equals(matrix2.get(i+1).get(j+1))){
                        if(matrix2.get(i).get(j).equals(matrix2.get(i+1).get(j-1)) && matrix2.get(i).get(j).equals(matrix2.get(i+2).get(j))){
                            matrix.get(i).set(j,"");
                            matrix.get(i+1).set(j,"");
                            matrix.get(i+1).set(j+1,"");
                            matrix.get(i+1).set(j-1,"");
                            matrix.get(i+2).set(j,"");
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(matrix.get(i).toArray()).replace("]","").replace("[","").replace(",","").replace(" ",""));
        }
        System.out.println(Arrays.toString(matrix.get(matrix.size()-2).toArray()).replace("]","").replace("[","").replace(",","").replace(" ",""));
        System.out.println(Arrays.toString(matrix.get(matrix.size()-1).toArray()).replace("]","").replace("[","").replace(",","").replace(" ",""));
    }
}
