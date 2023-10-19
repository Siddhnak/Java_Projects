package LearnCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class pracHashset {

    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Five"); //check for duplicate
        set.add("Bablya"); //check for duplicate
        set.add("babli"); //check for duplicate
        //Traversing elements
//
//        Iterator<String> i=set.iterator();
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }
        set.remove("Five");
        System.out.println("After invoking remove(object) method: "+set);

        HashSet<String> set1=new HashSet();
        set1.add("babu");
        set1.add("raju");
        set1.add("Shyam");
        set.addAll(set1);
        System.out.println("here is the updated set.."+set);

        //Removing all the new elements we added into the set

        set.removeAll(set1);
        System.out.println("here's after removing the new set we added:"+set);

        System.out.println("Pre removing Bablya"+set);
        set.removeIf(str->str.contains("Bablya"));
        System.out.println("After invoking removeIf() method: "+set);


//   Java HashSet from another Collection
        System.out.println("HashSet by passing arraylist's in the parameter");
        ArrayList<String>arlist=new ArrayList<>();
        arlist.add("Batman");
        arlist.add("Flash");
        arlist.add("Wwoman");

        HashSet<String> set3= new HashSet<>(arlist);
        set3.add("HUlk");
        for (String s : set3) {
            System.out.println(s);

        }
// Leaving out the book example now..

    }

}

//Dancing in unordered way..



/*
A list can contain duplicate elements whereas Set contains unique elements only.

hash table for storage
AbstractSet class and implements Set interface.
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
*/
