package prac;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] args) {


        linkedListAsQueue();

        //Find the element in linkedlist and its position in the list

        List<String> linkedList = new LinkedList<>();

        linkedList.add("JAVA");
        linkedList.add("J2EE");
        linkedList.add("JSP");
        linkedList.add("Servlets");
        linkedList.add("JDBC");




        if(linkedList.contains("Spring")){

            System.out.println("Index of the element JSP "+linkedList.indexOf("JSP"));
        }
        else{
            System.out.println("No such Element exists");
        }

        //traverse the elements in reverse order in Linkedlist

        Iterator<String> iterator = ((LinkedList<String>) linkedList).descendingIterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }

    public static void linkedListAsQueue(){

        LinkedList<Integer> listAsQueue = new LinkedList<>();

        listAsQueue.add(1);
        listAsQueue.add(2);
        listAsQueue.add(3);
        listAsQueue.add(4);

        System.out.println(listAsQueue);
        System.out.println(listAsQueue.poll());
        System.out.println(listAsQueue);
        System.out.println(listAsQueue.poll());
        System.out.println(listAsQueue);

    }


}
