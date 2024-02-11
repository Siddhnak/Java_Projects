package core.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MulitD {

    /*Multi dimensional arrays are arrays of arrays.
    To declare a multi dimensional array variable, specify each additional
    index using another set of square brackets.
    An example is given below for two dimensional array:*/


    /*JAGGED ARRAY:  a jagged array is an array of arrays where each sub-array can have a different length. This is in contrast to a regular multi-dimensional array, where all dimensions must have the same length. */

    int sample[][] = new int[3][];

//    the OUTER array has a length of 3 which implies that it can hold of 3 element
//    COOL

/*How to convert Array to List in java?
*
*
* one of the few utility methods.. arraylist provide us the functionality*/
public static void main(String[] args) {
//    int marr[]={2,2,3,3};
//    List<Integer> arrlist = new ArrayList<>();
//
//    for (int x:marr ){
////        System.out.println(x);
//        arrlist.add(x);
//    }




    /*issue
    *
    * The issue is that Arrays.asList() works with arrays of objects, not primitive types
    *  like int. In your case, it's trying to create a List<int[]>,
    * which is not what you want.
    *
    * Soln
    *
    * Loop through the list
    *
    * MORE
    * When you create an array of primitive types, like int[], you're creating an
    *  array that directly holds integer values in contiguous memory locations.

When you create an array of objects, like String[],
* you're creating an array that holds references (or pointers) to objects in memory.
* Each element in the array is a reference to an instance of a class.
* String is a class, so when you create an array of String, you're actually creating an array of references to String objects
    *
    *
    * */




     /*
     * WOW  idk this..
     * String sur[]={'sdf','ds','dgfd','dfd'};
     * To define a string in Java, you should use double quotes ("), not single quotes (').
     *  Single quotes are used for character literals, which can
     * only represent a single character.
     *
     * */
    String sur[]={"sdf","ds","dgfd","dfd"};
    List<String> surlist = Arrays.asList(sur);

    for(String x : surlist){
        System.out.println(x);}


}

}
