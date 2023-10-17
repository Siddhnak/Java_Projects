package LearnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

//      BEST    to      REVISE      ARRAYLIST   *******lOOK no FURTHER*********

public class PracArraylist {
    public static void main(String[] args) {

        ArrayList<String> color= new ArrayList<>();
        color.add("amber");
        color.add("blue");
        color.add("drapeblue");
        color.add("grey");
        color.add("lightblue");
        color.add("catcolor");
//        System.out.println(color); //simple print in array format

//Using iterator
//        Iterator itr= color.iterator(); //getting the iterator
//        while (itr.hasNext()){ //check if iterator has elements
//            System.out.println(itr.next()); //Printing and moving next


//USing simple for-each loop
//
//        for (String x:color){
//            System.out.println(x);
//        }

//Getting and setting the element

//System.out.println("Returning element using get: "+color.get(1));//getting
//color.set(1,"sky blue");//setting element
//
//for(String x:color)//{}
////{
////    //block reduncant..?
////}
//        System.out.println("Post setting \n"+color);

//How to Sort ArrayList
//
//        Collections.sort(color);
//        for(String x:color){}
//        System.out.println(color);

// Reverse list using list iterator Learnt so much

//        ListIterator<String> color1 = color.listIterator(color.size());//notice we pass last index here
//        while(color1.hasPrevious()){ /* thing to be noticed here if i give "colour"
//            it will throw error as there is no previous element for color*/
//            String revcolor= color1.previous();
//            System.out.println(revcolor);
//
//
//        }System.out.println("As you can see..\n" +
//                "the order is preserved and also\n" +
//                "the elements are reversed.. ");

////Simple for loop  || .get(i)
//        System.out.println("Traversing list through for loop:");
//        for(int i=0;i<color.size();i++)
//        {
////            System.out.println(color); //what would this print? ans: array mult times
//            System.out.println(color.get(i)); //Output: kind of on a new line good to eyes
//        }
////        System.out.println(color); //will give the array : Output array one time

// Come     Back      when      free  https://www.javatpoint.com/java-arraylist

//                          User-defined class objects in Java ArrayList

    }
}
