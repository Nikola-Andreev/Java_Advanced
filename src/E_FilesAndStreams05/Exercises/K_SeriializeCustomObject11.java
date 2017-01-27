package E_FilesAndStreams05.Exercises;

import java.io.*;

public class K_SeriializeCustomObject11 {

    private static class Course implements Serializable{

        String _name;
        Integer _numberOfStudents;

        Course(String name, int numberOfStudents){
            this._name = name;
            this._numberOfStudents = numberOfStudents;
        }

        private int getSize(){
            return this._numberOfStudents;
        }

        private String getName(){
            return this._name;
        }
    }

    public static void main(String[] args) {

        Course javaAdvanced = new Course("JavaAdvanced", 155);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\_NERO_\\Desktop\\course.ser"))){
            oos.writeObject(javaAdvanced);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\_NERO_\\Desktop\\course.ser"))) {
            Course softUniBestCourse = (Course) ois.readObject();
            System.out.println(softUniBestCourse.getName());
            System.out.println(softUniBestCourse.getSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
