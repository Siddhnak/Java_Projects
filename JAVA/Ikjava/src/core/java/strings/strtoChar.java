package core.java.strings;

import java.util.Arrays;


public class strtoChar{


    public static void main(String[] args){

        String str = "The book contains 234 pages";


        char [] cstring= str.toCharArray();

        System.out.println("This is the string converted array: "+ Arrays.toString(cstring));
    }


}