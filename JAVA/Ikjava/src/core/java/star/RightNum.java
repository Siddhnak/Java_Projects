package core.java.star;

public class RightNum {

    public static void main(String args[]) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j<=i; j++) {
                System.out.print(j);
//                System.out.print("*"); // BUGG!!
            }
            System.out.println();

        }
        System.out.println("Hurray!!! Finally complete...\nGood work!");
    }
}
