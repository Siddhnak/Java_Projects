package Randomtest;

public class Staticblock {

        static {System.out.println("block 1 - will print even though it's not within main");}
        static {System.out.println("block 2");}

        static {System.out.println("Main");}

        public static void main(String[] args) {
//            Staticblock t1= new Staticblock();
            System.out.println("inside main");

        }

}
