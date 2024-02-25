package core.java.strings;

public class Cw6_RemoveWhitespace {
    public static void main(String[] args) {
        String wst = "Hey how are you doing!!";

//        String nstr= wst.trim();                    /*Your code does not work because the trim method only removes leading and trailing spaces from a string, not the spaces in between*/
        String nstr=wst.replace(" ","");

        System.out.println("Here's your String WO whitespace.."+nstr);
    }


}
