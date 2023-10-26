package core.java.strings;

import java.util.Scanner;

public class Cw3Replowtoup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string pls: ");
        String str = sc.next();
//        String Ustr=null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a'&& str.charAt(i)<='z'){
                str.toUpperCase();
            }

        }
        System.out.println(str);
    }
}
