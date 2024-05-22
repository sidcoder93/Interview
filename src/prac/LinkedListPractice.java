package prac;

import com.sun.security.jgss.GSSUtil;

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


        //Add elements at the beginning of the list

        listAsQueue.addFirst(5);
        System.out.println(listAsQueue);
        listAsQueue.offerFirst(6);
        System.out.println(listAsQueue);

        //add elements at the lat of the list

        listAsQueue.addLast(7);
        System.out.println(listAsQueue);
        listAsQueue.offerLast(8);
        System.out.println(listAsQueue);


        LinkedList<Integer> newlist = new LinkedList<>();

        newlist.add(19);
        newlist.add(20);
        newlist.add(21);

        listAsQueue.addAll(4, newlist);
        System.out.println(listAsQueue);


        listAsQueue.addFirst(5);
        listAsQueue.offer(5);

        System.out.println(listAsQueue);

        //remove elements from both ends

        System.out.println(listAsQueue.removeFirst());

        System.out.println(listAsQueue.remove());

        System.out.println(listAsQueue.removeIf(elment -> elment>10));
        System.out.println(listAsQueue);

        //replace element at a specific position

        listAsQueue.set(1,4);

        System.out.println(listAsQueue);


        listAsQueue.getLast();
        System.out.println(listAsQueue);

        //clone of linkedlist

        LinkedList<Integer> newLinkedList = new LinkedList<>();

        newLinkedList = (LinkedList<Integer>) listAsQueue.clone();

        System.out.println(newLinkedList);










    }


}
