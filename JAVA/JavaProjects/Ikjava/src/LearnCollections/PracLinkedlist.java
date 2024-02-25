package LearnCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class PracLinkedlist {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("INa");
        ll.add("Meena");
        ll.add("Dika");
        System.out.println(ll);

        ll.add(1,"Kachraseth");
        System.out.println("Post adding single element"+ll);

        LinkedList<String> ll2= new LinkedList<>();
        ll2.add("Raju");
        ll2.add("Babubhaiya");
        ll2.add("Shyam");
        ll2.addAll(ll);
        System.out.println("Previous list to current list"+ll2);

        LinkedList<String> ll3= new LinkedList<>();
        ll3.add("totla Seth");
        ll3.add("Johny lever");
        ll3.add("Laxmi_chit_fund");
        ll2.addAll(1,ll2);
        System.out.println("\nPrevious list to current list at a " +
                "specific position"+ll2);

        Iterator itr = ll3.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());//iteration works here too..
        }

        //LAZY
        //Adding an element at the first position
        ll.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: "+ll);
        //Adding an element at the last position
        ll.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: "+ll);





    }
}




//Java LinkedList class can contain duplicate elements.
//Java LinkedList class maintains insertion order.
//Java LinkedList class is non synchronized.
//In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//Java LinkedList class can be used as a list, stack or queue

//    Optimization: the underlying data structure for a LinkedList is actually a doubly-linked list,
//    with each element having both forward and backward links to elements around it.
//    Java LinkedList class uses a doubly linked list to store

//        the elements. It provides a linked-list data structure.
//        It inherits the AbstractList class and implements List and Deque interfaces.
