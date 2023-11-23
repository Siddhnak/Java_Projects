package core.java.strings;

import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        System.out.println("Tell your num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String snum= Integer.toString(num);
        int count =0;
        int sum =0;
        for(int i=0;i<snum.length();i++){
            count++;


        }
        System.out.println("Number of digits"+count);
        for(int i=0;i<snum.length();i++){
            StringBuilder sb = new StringBuilder(snum);
            char charnum[]= snum.toCharArray();
//            char a = charnum.charAt[i];



        }

        } 


}
