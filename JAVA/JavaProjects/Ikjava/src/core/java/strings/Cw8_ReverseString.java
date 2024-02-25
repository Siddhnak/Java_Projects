package core.java.strings;

public class Cw8_ReverseString {
    public static void main(String[] args) {
        //1st approach: Using String Builder

        String str = "Kaalaundir";
//        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb.reverse());

        // 2nd Approach: using for loop

        char []schar = str.toCharArray();
        for(int i= schar.length-1;i>=0;i--){
            System.out.print(schar[i]);
        }
    }


}
