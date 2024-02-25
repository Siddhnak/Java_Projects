package temp.Hackerrank.OPformatting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rwork{


    //Below code will print only once

//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("================================");
//        String formattedString=null;
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
////            //Complete this line
////            int lastposition=s1.length()-1;
////            String strnew=String.format(%lastposition);
//              formattedString = String.format("%-15s%03d", s1, x);  //miss helped
////            System.out.println(formattedString);
//
//        }
//            System.out.println(formattedString);
//
//        System.out.println("================================");
//    }

    //Working code

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("================================");
        List<String> formattedString= new ArrayList<>();
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
//            //Complete this line
              String currentformattedString = String.format("%-15s%03d", s1, x);  //miss helped
//            for
            formattedString.add(currentformattedString);

        }
        for ( String x : formattedString) {
            System.out.println(x);
        }

//        What's this ? ask miss
//        formattedString.forEach(System.out::println);




        System.out.println("================================");
    }



}
