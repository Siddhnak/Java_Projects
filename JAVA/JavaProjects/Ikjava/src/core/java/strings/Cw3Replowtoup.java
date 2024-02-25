package core.java.strings;

import java.util.Scanner;

public class Cw3Replowtoup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string pls: ");
        String str = sc.next();
        StringBuilder newStr=new StringBuilder();
//        String Ustr=null;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='a'&& ch<='z'){
                newStr.append(Character.toUpperCase(ch));
            }else{
                newStr.append(ch);
            }

        }
        System.out.println(newStr);
    }
}
