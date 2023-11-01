package core.java.strings;

import java.util.Scanner;

public class cw3_UppertoLower {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string pls: ");
        String str = sc.next();
        StringBuilder newStr1 = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch1= str.charAt(i);

            if(ch1>='A' && ch1<='Z'){
                newStr1.append(Character.toLowerCase(ch1));
            }else{
                newStr1.append(ch1);
            }
        }
        System.out.println("Updated Str :"+newStr1);


    }
}
