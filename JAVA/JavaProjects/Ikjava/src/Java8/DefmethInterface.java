package Java8;





//https://www.javatpoint.com/java-lambda-expressions best for understanding lambda

//              that's basically all which it has
//              main
//              ()->{}

public interface DefmethInterface {

    ////   1   Since Java 8, we can have method body in interface.
//// BUT we need to make it DEFAULT method.
//// Let's see an example:

//    void draw();
//
//    default void msg() {
//        System.out.println("default method");
//    }
//
//    class Rectangle implements DefmethInterface {
//        public void draw() {
//            System.out.println("drawing rectangle");
//        }
//    }
//
//    class TestInterfaceDefault {
//        public static void main(String args[]) {
//            DefmethInterface d = new Rectangle();
//            d.draw();
//            d.msg();
//        }
//    }

//    2     also Since Java 8,
//    we can have static method in interface. Let's see an example:
interface Drawable{
    void draw();
    static int cube(int x){return x*x*x;}
}
    class Rectangle implements Drawable{
        public void draw(){System.out.println("drawing rectangle");}
    }
    class TestInterfaceStatic{
        public static void main(String args[]){
            Drawable d=new Rectangle();
            d.draw();
            System.out.println(Drawable.cube(3));
        }}


}

