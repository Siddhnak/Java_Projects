package core.java.star;

public class DiamondPattern {
    
    static void patternd(int n){                                     //1. Good way to create a new method itself..
        for(int row =1; row<=2*n-1; row++){                              //2. Basic outer loop.. will be parent to all the sublogic
            int maxCols = row >n ? 2 * n - row:row;                  // 1 Using ternary  2 getting the formulae  3 had no idea this has to be placed post first for-loop and learned now from Kunal Q5 pattern..
            int spaces =n-maxCols;                                  //Give whatever conditions you wish to give right after row loop and then

            for(int sp =1;sp<=spaces;sp++){
//                System.out.println("a"); BUGGGGG!! ln
                System.out.print(" ");
            }
            for (int col = 1; col <= maxCols; col++) {
//                System.out.print("*");  Bugggg!!!
                System.out.print("* ");
            }
            System.out.println();
        }
//        System.out.println();

    }

    public static void main(String[] args) {
        patternd(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            for (int j = 2 * n - 1; j >=row; j--) {
//                for (int x = 1; x <= n-1; x++) { wasted a day..
                System.out.print("a");
            }

            System.out.println();

        }
    }



}

//Desired Output

/*

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *


 */
