package I_StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class StudentSpeciality{

    private String _name;
    private int _facultyNumber;

    StudentSpeciality(String name, int facultyNumber){
        this._facultyNumber = facultyNumber;
        this._name = name;
    }

    int get_facultyNumber() {
        return _facultyNumber;
    }

    String get_name() {
        return _name;
    }
}

class Student{

    private String _name;
    private int _facultyNumber;

    Student(String name, int facultyNumber){
        this._facultyNumber = facultyNumber;
        this._name = name;
    }

    int get_facultyNumber() {
        return _facultyNumber;
    }

    String get_name() {
        return _name;
    }
}

public class K_StudentsSpecialities11 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<Student> students = new ArrayList<>();
        List<StudentSpeciality> specialities = new ArrayList<>();

        while (true){
            String[] input = scan.readLine().split("\\s+");
            if("Students:".equals(input[0])){
                break;
            }
            String specialityName = input[0] +" " + input[1];
            Integer facNum = Integer.valueOf(input[2]);
            StudentSpeciality speciality = new StudentSpeciality(specialityName, facNum);
            specialities.add(speciality);
        }

        while (true){
            String[] input = scan.readLine().split("\\s+");
            if("END".equals(input[0])){
                break;
            }
            Student student = new Student(input[1] + " " + input[2], Integer.valueOf(input[0]));
            students.add(student);
        }

        students.stream().sorted(Comparator.comparing(Student::get_name))
                .forEach(student -> {specialities.stream().filter((spec) -> spec.get_facultyNumber() == student.get_facultyNumber())
                .forEach(speciality -> {System.out.printf("%s %s %s\n", student.get_name().trim(), student.get_facultyNumber(), speciality.get_name());
                });
        });
    }
}