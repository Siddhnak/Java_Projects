

package EH;

import java.util.Scanner;
/**
 *
 * @author Siddhant Naik
 */
public class Test_class {

//    public static void main(String[] args) {
//
//        try {
////                int nm[]=new int [6];
//            int nm[] = new int [5]; //this will throw the nullpointer exception
//            nm[6] = 8;
//            int a, b, c;
//            a = 4;
//            b = 0;
//            c = a / b;
//            System.out.println("text" + c);
////        } catch (Exception e) {
////            System.out.println("This is something belonging to the mother box");
////        } catch (ArithmeticException e) {
//            System.err.println("Error ");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("you are exceeding the array limit");
//        } finally {
//            System.out.println("End of the program");
//        }
//
//    }
    
    




   public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        System.out.println("Tell me your int"+i);
        double d = scan.nextDouble();
        System.out.println("Tell me your double"+d);
        String s=scan.next("Welcome to HackerRank's Java tutorials");
        
         System.out.println("Tell me your String"+s);

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
