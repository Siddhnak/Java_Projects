package core.java.strings;

public class Cw9_Palindrome {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();


        String sottr= "kadka";
        char []schar = sottr.toCharArray();
        for(int i= schar.length-1;i>=0;i--){
            sb.append(schar[i]);
        }
        String revsottr= sb.toString();
        if(sottr.equals(revsottr)){
            System.out.println("That's a palindrome!!");

        }else{
            System.out.println("It's not a palindrome..");
        }
    }

}

