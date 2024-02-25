package core.java.strings;

public class SeparateDigit {

    public static void main(String[] args) {
        //Separate numbers

        int a = 2532;

        String b= Integer.toString(a);
        System.out.println("Original num: "+a);
        System.out.println("Separated Digits: ");

        for(int i=0;i<b.length();i++){
//            System.out.print(b.charAt(i));
            System.out.println(i);

        }


    }
}
