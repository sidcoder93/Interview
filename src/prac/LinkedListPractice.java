package prac;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class LinkedListPractice {

    public static void main(String[] args) {

        //linkedListAsQueue();

       //  list();
       // list1();
        // linkedListPrac();
       // listAsQueue();
    try {

        listAsStack();

    }catch (MyException ex){

        System.out.println("Caught");
        System.out.println(ex.getMessage());
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


    public static void list(){


        List<String> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i=1; i<1000000; i++){

            linkedList.add("Siddharth");

        }

        //linkedList.get(100);
       // linkedList.remove(101);

        for(int index= 101; index<200 ; index++) {
            linkedList.add(index, "Siddharth");
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("Total ms taken to add elements linkedList is: " + (endTime-startTime) + " ms");


    }

    public static void list1(){


        List<String> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i=1; i<1000000; i++){

            arrayList.add("Siddharth");

        }
       // arrayList.get(100);
       // arrayList.remove(101);

        for(int index= 101; index < 200; index++) {
            arrayList.add(index, "Siddharth");
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("Total ms taken to add elements in Arraylist is: " + (endTime-startTime) + " ms");


    }

    public static  void linkedListPrac(){

        List<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");


        ListIterator<String> stringListIterator = linkedList.listIterator(linkedList.size());

        while(stringListIterator.hasPrevious()){

            System.out.println(stringListIterator.previous());
        }
    }

    public static void listAsQueue(){

        // in this scenario list will behave as FIFO

        LinkedList<String> list = new LinkedList<>();

        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("E");


        System.out.println(list);

        System.out.println(list.poll());  //a
        System.out.println(list.poll());  //B

        System.out.println(list.pollFirst()); //C
        System.out.println(list.peek());  //D
        //System.out.println(list.peek());
        System.out.println(list.peekLast()); //E
        System.out.println(list.pollLast());  //E
        System.out.println(list.peekLast()); //D

    }

     public static void listAsStack() throws MyException {

        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

         System.out.println(stack);

         try {
             System.out.println(stack.pop());
             System.out.println(stack.pop());
             System.out.println(stack.pop());
             System.out.println(stack.pop());
             System.out.println(stack.pop());

         }catch (NoSuchElementException ex){
             System.out.println("There is no element in the Stack : " + ex.getMessage());
             throw new MyException("Thrown NoSuchElementException", ex.getCause());


         }
     }


}
