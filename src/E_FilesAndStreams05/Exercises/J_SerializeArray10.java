package E_FilesAndStreams05.Exercises;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J_SerializeArray10 {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        Collections.addAll(list, 2.2, 5.8, 33.6, 0.877);
        String path = "C:\\Users\\_NERO_\\Desktop\\list.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(list);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
