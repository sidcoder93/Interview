package contract;

public class Student {

    public String name;
    public int rollNo;

    public Student(){

    }

    public Student(String name, int rollNo){

        this.name = name;
        this.rollNo = rollNo;
    }



    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }
        if(!(obj instanceof Student)){
            return false;
        }

        Student otherStudent = (Student) obj;

        return this.rollNo==otherStudent.rollNo;

    }

    @Override
    public int hashCode(){
        return this.rollNo;
    }
}
