package core.java.star;

public class MixpyramidCorrected_understood {
     public static void main(String args[]) {
            pattern(5);
        }

        static void pattern(int n) {
         //have kept the logic damn simple..
            for (int row = 1; row <= 2 * n-1; row++) {  // normal row controlling loop
//                int maxCols = (row <= n) ? row : 2 * n - row;
                int maxCols = row >n ? 2 * n - row:row;  // 1 Using ternary  2 getting the formulae  3 had no idea this has to be placed post first for-loop and learned now from Kunal Q5 pattern..
                for (int col = 1; col <= maxCols; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

}

/*

Desired Output..
*
**
***
****
*****
****
***
**
*

Process finished with exit code 0


*/
