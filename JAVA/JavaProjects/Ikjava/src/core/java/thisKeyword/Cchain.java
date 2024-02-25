package core.java.thisKeyword;

public class Cchain {

//                 #### 03   CONSTRUCTOR CHAINING ######

//    ## EX1
//    Calling default constructor from parameterized
//    constructor (can be done vice-versa too)


    Cchain() {
        System.out.println("hello a");
    }

    Cchain(int x) {
        this();
        System.out.println(x);
    }

    class TestThis5 {
        public static void main(String args[]) {
            Cchain a = new Cchain(10);
        }
    }
}


