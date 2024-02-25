package core.java.strings;// 1. Write a Java program to get the character at the
// given index within the string.

// Sample Output:

// Original String = Java Exercises!
// The character at position 0 is J
// The character at position 22 is i

import java.util.Scanner;

class Hithere {


    public static void main(String args[]) {
        try {
            String str = "Java Exercises!";

            System.out.println("Enter what is the position you desire to get");
            Scanner sc = new Scanner(System.in);
            int position = sc.nextInt();

            char ch = str.charAt(position);

            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("You are entering it the wrong way man");;
        }
    }
}