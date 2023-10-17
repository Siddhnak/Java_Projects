package core.java.thisKeyword;

public class Argpas {

        void m(Argpas obj){
            System.out.println("method is invoked");
        }
        void p(){
            m(this);
        }
        public static void main(String args[]){
            Argpas s1 = new Argpas();
            s1.p();   //calling p method
        }

}
