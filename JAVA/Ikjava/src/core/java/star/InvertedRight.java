package core.java.star;

public class InvertedRight {

    public static void Pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
//                for (int x = 1; x <= n-1; x++) { wasted a day..
                System.out.print("*");
            }
            System.out.println();
//            n--;
        }
    }

    public static void main(String[] args) {
        Pattern(5);
    }
}

/*

Desired Output..
*****
****
***
**
*

*/