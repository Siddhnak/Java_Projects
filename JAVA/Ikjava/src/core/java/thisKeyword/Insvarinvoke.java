package core.java.thisKeyword;

// Just read this class and you will automatically answer all the this keyword
// related questions


//               #### 01 this: to refer current class instance variable ######


//tip  It is better approach to use meaningful names for variables.
// Reason y we use same name for instance variables and parameters in real time, and always use this keyword.

public class Insvarinvoke {
    int rollno;
    String name;
    float fee;

    Insvarinvoke(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }

    class TestThis2 {
        public static void main(String args[]) {
            Insvarinvoke s1 = new Insvarinvoke(111, "ankit", 5000f);
            Insvarinvoke s2 = new Insvarinvoke(112, "sumit", 6000f);
            s1.display();
            s2.display();
        }
    }
}


