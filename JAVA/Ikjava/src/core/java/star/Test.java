package core.java.star;

public class Test {

    public static void Pattern(int n) {
        int rowCount = n;

        for (int i = 1; i <= n; i++) {
            for (int j = rowCount; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            rowCount--;
        }
    }

    public static void main(String[] args) {
        Pattern(5);
    }
}
