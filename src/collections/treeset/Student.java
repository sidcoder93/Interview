package collections.treeset;

public class Student {

    int id;
    String name;
    int percent;


    public Student(int id, String name, int percent){

        this.id = id;
        this.name = name;
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percent=" + percent +
                '}';
    }

    @Override
    public boolean equals(Object o){

        if(this == o){
            return true;
        }

        if(!(o instanceof Student)){
            return false;
        }

        else{

            Student s = (Student)o;

            return this.id == s.id;

        }
    }

    @Override
    public int hashCode(){

        return this.id;

    }
}
