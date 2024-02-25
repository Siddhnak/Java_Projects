package core.java.thisKeyword;

public class Cchain2 {
//## EX2
//    Real usage of this() constructor call
//
//    The this() constructor call should be used to reuse the
//    constructor from the constructor. It maintains the chain
//    between the constructors i.e. it is used for constructor chaining.
        int rollno;
        String name,course;
        float fee;
    Cchain2(int rollno,String name,String course){  //Constructor 1
            this.rollno=rollno; // Rule: Call to this() must be the first statement in constructor.
            this.name=name;
            this.course=course;
        }
    Cchain2(int rollno,String name,String course,float fee){
            this(rollno,name,course);       //reusing constructor by simple call
            this.fee=fee;                   // as fee instance var needs to be invoked here
        }
        void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}

    class TestThis7{
        public static void main(String args[]){
            Cchain2 s1=new Cchain2(007,"Hulk","java");
            Cchain2 s2=new Cchain2(382,"IronMan","python",6000f);
            s1.display();
            s2.display();
        }}

}

