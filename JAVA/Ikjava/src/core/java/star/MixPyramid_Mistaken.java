package core.java.star;

public class MixPyramid_Mistaken {

    public static void main(String args[]) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int r = 1; r <= 2*n-1; r++) {
//        int c= 1;
                if(r>n)
                {
                    for ( int c = 1; c <= n; c++) {
                        c = r - n;
                        System.out.println("* ");
                    }
                }
                else{
                    for ( int c = 1; c <= n; c++) {
                        c=r;
                System.out.println("* ");
                }
                }
            System.out.println();
        }
        }
    }


