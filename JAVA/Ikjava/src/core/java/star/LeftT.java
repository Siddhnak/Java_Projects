package core.java.star;

public class LeftT {

    public static void main(String args[]) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= n-row; sp++) {
//                for (int x = 1; x <= n-1; x++) { wasted a day..
                    System.out.print("p");
            }
//            for (int st = n; st <= row; st--) { wrong condition pointed out..
//                for (int st = row; st>=row; st--) {  WRONG too hard time thinking..
                    for (int st = row; st>=1; st--) {
                        System.out.print("*");


////
                System.out.print("*");
            }
            System.out.println();

        }
    }

}