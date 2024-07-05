package attendence;

import java.util.*;
import java.util.stream.Stream;

public class CustomRegister {

    HashMap<Integer, Integer> register;

    public CustomRegister(){

        this.register = new HashMap<>();
    }


    public void addAttendence(int[] a){

        for(int i=0; i<a.length; i++){

            register.put(a[i], register.getOrDefault(a[i], 0)+1);
        }
    }

    public void changeAttendence(int id, char c){

        if(c == 'A'){

            int count = register.get(id);
            register.put(id, count-1);
            System.out.println("The attendance of student with Id: "+ id + " has been reduced by one");
        }

        if(c == 'P'){

            int count = register.get(id);
            register.put(id, count+1);
            System.out.println("The attendance of student with Id: "+ id + " has been increased by one");

        }
    }

    public void reduceRegister(int limit){

        System.out.println("Removing students with less attendance");
        List<Integer> lessAttendence = new ArrayList<>();

       for(Map.Entry<Integer, Integer> map : register.entrySet()){

           if(map.getKey()<limit){
               lessAttendence.add(map.getKey());
           }
       }

       for(Integer i : lessAttendence){
           register.remove(i);
       }


    }

    public void personalAttendance(int id){

        if(register.containsKey(id)){
            System.out.println("The Attendance of the student with id "+id + " is "+ register.get(id));
        }
        else{
            System.out.println("The Student with id "+id + " has been removed due to low attendance");
        }
    }


    public int maxAttendance(){

      return  register.values()
                .stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
    }


}
