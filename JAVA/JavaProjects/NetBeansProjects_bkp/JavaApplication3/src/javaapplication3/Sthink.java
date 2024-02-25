//ackage Exception_hand;

import java.util.Scanner;

public class Sthink {

//Won't work if you give the class before the main

    /*Checking the method
    * */

     public static void main(String[] args) {
try{
         float a=4,b=5;
         float c;
         Scanner sc = new Scanner(System.in);
    System.out.println("Tell me your a");
         a=sc.nextInt();
    System.out.println("Tell me your b");

    b=sc.nextFloat();
         c = b/a;
    System.out.println("YOur result is "+c+"\nthanks");

}
catch (ArithmeticException e){
    System.out.println("Seems something is wrong.." +
            "Check if you have given 0 below");
}

    }

}