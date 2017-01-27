package D_SetAndMaps04.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TreeMap<String, Double> students = new TreeMap<>();
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            String studentName = scan.nextLine();
            double[] grades = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double averageGrade = 0.0;
            for (double grade : grades) {
                averageGrade += grade;
            }
            averageGrade = averageGrade / grades.length;
            students.put(studentName, averageGrade);
        }

        DecimalFormat df = new DecimalFormat("#.################");
        for (Map.Entry<String, Double> value: students.entrySet()) {
            System.out.println(value.getKey()+" is graduated with "+df.format(value.getValue()));
        }
    }
}
