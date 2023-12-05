package core.java.star;

public class LeftT {

    public static void main(String args[]) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n-i; sp++) {
//                for (int x = 1; x <= n-1; x++) { wasted a day..
                    System.out.print(" ");
            }
//            for (int st = n; st <= row; st--) { wrong condition pointed out..
//                for (int st = row; st>=row; st--) {  WRONG too hard time thinking..
                    for (int st = 1; st<=i; st++) {
                        System.out.print("*");



//                System.out.print("*"); // BUGG!!
            }
            System.out.println();

        }
        System.out.println("Hurray!!! Finally complete...\nGood work!");
    }

}