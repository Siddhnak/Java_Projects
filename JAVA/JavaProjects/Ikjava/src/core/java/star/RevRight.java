package core.java.star;

public class RevRight {

        public static void main(String args[]) {
            pattern(5);
        }

        static void pattern(int n){

            int col,row=1;
            n=5;

            for(row=1;row<=n;row++){
//                for(int x=1;x<=n;x++){
//                    System.out.print(" ");
//                }

                for(col=n;col>0;col--){
                    System.out.print("*");
                    col = n-row;
                }
                System.out.println();

            }
        }

}
