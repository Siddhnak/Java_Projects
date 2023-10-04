/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siddhant Naik
 */
//package Exception_hand;

import java.util.Scanner;

public class NewClass {

//Won't work if you give the class before the main

    /*Checking the method
    * */

     public static void main(String[] args) {
try{
         int a=4,b=5;
         int c;
         Scanner sc = new Scanner(System.in);
    System.out.println("Tell me your a");
         a=sc.nextInt();
    System.out.println("Tell me your b");

    b=sc.nextInt();
         c = b/a;
    System.out.println("YOur result is "+c+"\nthanks");

}
catch (ArithmeticException e){
    System.out.println("Seems something is wrong.." +
            "Check if you have given 0 below");
}

    }

}