package Java8.functionalprog;

//public class UsingJava8 {
//}

// Executor class using lambda expressions
class UsingJava8 {
    public void makeBeverage(MakeBeverage makeBeverage) { //injecting MakeBeverage's method here in
        makeBeverage.make();
    }//overried make method basic rule for an interface

    public static void main(String[] args) {
        UsingJava8 beverageMakerWithLambda = new UsingJava8();

        // Using lambda expression to define behavior no need to implement it too
//MakeBeverage action = (Your task here) -> System.out.println("Make whatever beverage you want!");
        MakeBeverage makeHotchocolate = () -> System.out.println("Steamy hot chocolate ready for you!!\n" +
                "🍫☕");
        MakeBeverage makeIcecream = () -> System.out.println("White Ice here for you\n" +
                "🍦❄");
        MakeBeverage hotTea = () -> System.out.println("Delicious tea Bun Maska here for U !!!\n" +
                "☕🍞");

        // Passing the behavior directly
        beverageMakerWithLambda.makeBeverage(makeHotchocolate); //invoking created method using beverageMakerWithLammbda.the
        beverageMakerWithLambda.makeBeverage(makeIcecream);
        beverageMakerWithLambda.makeBeverage(hotTea);
    }
}