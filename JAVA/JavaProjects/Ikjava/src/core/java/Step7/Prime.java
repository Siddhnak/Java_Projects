package core.java.Step7;

public class Prime {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=(n*n);i++){
            if(n%i==0){
                System.out.println("no. is prime");

            }
            else{
                System.out.println("it's a prime..");
            }
        }
    }

}
