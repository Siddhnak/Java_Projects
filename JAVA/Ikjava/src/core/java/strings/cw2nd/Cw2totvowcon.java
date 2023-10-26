package core.java.strings.cw2nd;

import java.util.Scanner;

public class Cw2totvowcon {
    public static void main(String[] args) {
        String vow= "aeiou";
        String cons= "bcdfghjklmnpqrstvxyz";

        int cvow= 0;
        int ccon= 0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string pls: ");
        String s1= sc.next();

        char [] s1char= s1.toCharArray();
        char [] vowchar= vow.toCharArray();
        char [] conschar= cons.toCharArray();

        for(char x:s1char ){
//            if (Chars.contains()
            if (vow.indexOf(x) != -1) {
                cvow++;}
            else if (cons.indexOf(x) != -1) {
                ccon++;
            }
            }
        System.out.println("vowels count: "+cvow+" \nconsonants count: "+ccon );

    }
}
