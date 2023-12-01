package core.java.star;

public class Myclass {
    public static void main(String args[]) {

        int n = 5;
        int i=1;
//        int col=1;

        // Garima's way..

        while(i<=n){
            int col=1;
            while(col<=n){
                System.out.print("*");
                col+=1;
            }
            //Prep
            System.out.println(); // != soutprint("") but = System.out.print("\n")
            i+=1;
        }

        //  System.out.println("");

    }
}
