package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String file = "file.ser";

        FileInputStream fis = new FileInputStream(file);

        ObjectInputStream ois = new ObjectInputStream(fis);

        Person object = (Person) ois.readObject();

        fis.close();
        ois.close();


        System.out.println("----Deserialized Object----");
        System.out.println(object.toString());


    }
}
