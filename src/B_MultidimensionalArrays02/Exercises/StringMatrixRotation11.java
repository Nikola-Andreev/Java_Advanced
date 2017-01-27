package B_MultidimensionalArrays02.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> matrix = new ArrayList<>();
        String dimensionsForMatrix = scan.nextLine();
        while (!dimensionsForMatrix.equals("END")){
            matrix.add(dimensionsForMatrix);
            dimensionsForMatrix = scan.nextLine();
        }
        int startIndex =input.indexOf('(');
        int endIndex =input.indexOf(')');
        int degrees = Integer.parseInt(input.substring(startIndex+1,endIndex));
        int maxLength = 0;
        for (String aMatrix1 : matrix) {
            if (aMatrix1.length() > maxLength) {
                maxLength = aMatrix1.length();
            }
        }

        /*if(degrees != 0 && degrees%360 != 0) {
            for (int i = 0; i < matrix.size(); i++) {
                if (matrix.get(i).length() < maxLength) {
                    String intervals = new String(new char[maxLength - (matrix.get(i).length())]).replace("\0", " ");
                    String str = matrix.get(i) + intervals;
                    matrix.set(i, str);
                }
            }
        }*/

        if(degrees == 0 || degrees%360 == 0){
            for (String aMatrix : matrix) {
                System.out.println(aMatrix);
            }
        }
        else if(degrees == 270 || degrees%360 == 270){
            for (int col = matrix.get(0).length()-1; col >=0; col--) {
                String str = "";
                for (String aMatrix : matrix) {
                    str += aMatrix.charAt(col);
                }
                System.out.println(str);
            }
        }
        else if(degrees == 180 || degrees%360 == 180){
            for (int row = matrix.size()-1; row >= 0; row--) {
                String str = matrix.get(row);
                str = new StringBuilder(str).reverse().toString();
                System.out.println(str);
            }
        }
        else if(degrees == 90 || degrees%360 == 90 ){
            for (int col = 0; col < matrix.get(0).length(); col++) {
                String str = "";
                for (int row = matrix.size()-1; row >=0; row--) {
                    str += matrix.get(row).charAt(col);
                }
                System.out.println(str);
            }
        }
    }
}
