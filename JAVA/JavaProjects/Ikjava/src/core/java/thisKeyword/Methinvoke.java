package core.java.thisKeyword;

public class Methinvoke {
//    # 02 this: this: to invoke current class method ######

// You may invoke the method of the current class by using the this keyword.
// If you don't use the this keyword, compiler automatically adds this keyword
// while invoking the method. Let's see the example
        void m() {
            System.out.println("hello m");
        }
        void n() {
            System.out.println("hello n");
//m();//same as this.m()
            this.m();
        }
    class TestThis4 {
        public static void main(String args[]) {
            Methinvoke a = new Methinvoke();
            a.n();
        }
    }
}
