package F_ManualStringProcessing.Lab;

import java.util.*;

public class A_StudentsResults01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        TreeMap<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String[] inputTokens = scan.nextLine().split(" - ");
            String studentName = inputTokens[0];
            String[] studentGrades = inputTokens[1].split(", ");
            List<Double> temp = new ArrayList<>();
            double sum = 0.0;
            for (String studentGrade : studentGrades) {
                double grade = Double.parseDouble(studentGrade);
                temp.add(grade);
                sum += grade;
            }
            temp.add(sum/3);
            students.put(studentName, temp);
        }

        if(number > 0) {
            System.out.println("Name      |   JAdv|JavaOOP| AdvOOP|Average|");
            for (String s : students.keySet()) {
                System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", s, students.get(s).get(0),
                        students.get(s).get(1), students.get(s).get(2), students.get(s).get(3)).replace(".", ","));
            }
        }
    }
}