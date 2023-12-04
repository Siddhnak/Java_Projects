package core.java.star;

public class InvRigh {
    public static void main(String args[]) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int i = 0; i <= n; i++) {
//            for (int sp = 1; sp <= n-i; sp++) {
////                for (int x = 1; x <= n-1; x++) { wasted a day..
//                System.out.print(" ");
//            }
//
            for (int j = 1; j<=n-i; j++) {//Always dry run..SMART sir way.. no matter what..
                System.out.print("*");
//                System.out.print("*"); // BUGG!!
            }
            System.out.println();

        }
        System.out.println("Hurray!!! Finally complete...\nGood work!");
    }
}

