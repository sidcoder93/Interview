package serialization;

import java.io.*;

public class Test {


    public static void main(String[] args) {


        Person person = new Person();
        FileOutputStream fos;
        ObjectOutputStream oos;

        person.setId(1);
        person.setName("Siddharth");
        person.setAddress("Pune");

        String file = "file.ser";


        try{

            //Serialize
             fos = new FileOutputStream(file);
             oos = new ObjectOutputStream(fos);

            oos.writeObject(person);

            fos.close();
            oos.close();




        }catch (IOException ex){

            ex.printStackTrace();


        }

    }
}
