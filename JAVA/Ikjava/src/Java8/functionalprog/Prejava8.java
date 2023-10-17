package Java8.functionalprog;
//This is preJava 8
public class Prejava8
{
}

 class MakeCoffee implements MakeBeverage{

    @Override
    public void make() {
        System.out.println("Making Coffee");
    }
}



class MakeTea implements MakeBeverage{

    @Override
    public void make() {
        System.out.println("Making Tea");
    }

}
/*Dependency injection is a key concept in software
engineering, particularly in the context of building
scalable, maintainable, and testable applications.*/
class BeverageMaker  {
    public void makeBeverage(MakeBeverage makeBeverage) {
        makeBeverage.make();
    }
    public static void main(String[] args) {
        BeverageMaker beverageMaker = new BeverageMaker();
        MakeCoffee makeCoffee = new MakeCoffee();
        MakeTea makeTea = new MakeTea();
//        beverageMaker.makeBeverage(makeCoffee);
//        beverageMaker.makeBeverage(makeTea);

    }
}