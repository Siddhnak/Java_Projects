package core.java.star;

public class DiamondPattern {

    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            for (int j = 2 * n - 1; j >=row; j--) {
//                for (int x = 1; x <= n-1; x++) { wasted a day..
                System.out.print("a");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern(5);
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
