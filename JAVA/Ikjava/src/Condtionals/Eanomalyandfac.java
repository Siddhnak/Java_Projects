package Condtionals;

import java.util.Scanner;

public class Eanomalyandfac {

    static void Menu(){

        int a=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("here goes Your chici: \n Enter any operation" +
                "\nadd" +
                "\sub");
        String option = sc.nextLine();

        String res= (a==1&&option=="add"? "Done" :"NOpee");
        System.out.println(res);

    }

    public static void main(String[] args) {
//        Eanomaly.Menu(); //Beauty of static
Scanner m= new Scanner(System.in);
//int n= 0;
        System.out.println("Enter your num:");
         int n=m.nextInt();

         int fac =1;
        for(int i=1;i<=n;i++){
        fac*=i;
        }
        System.out.println("factorial is  "+fac);

    }
}
