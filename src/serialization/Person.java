package serialization;

import java.io.Serializable;

public class Person implements Serializable {


   // private static final long serialVersionUID = 1234L;
    private transient int id;
    private String name;

    private String address;


    public void setId(int id){
        this.id = id;
    }

    public int getId(){

        return id;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return  name;
    }

    public void setAddress(String address){

        this.address = address;
    }

    public String getAddress(){
        return  address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
