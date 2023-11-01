package core.java.strings;
//
//
public class CW4_Anagram {
    //    String s1= "triangle";        Wrong trial
//    String s2= "integral";
//
//    for(char x : s1.toCharArray()){
//        if(s2.indexOf(x)==1){
//            System.out.println("S2 IS an anagram of S1");}else{
//            System.out.println("S2 is NOT an anagram S1");
//        }
//    }
//
//}
    public static void main(String[] args) {
        String s1 = "triangle";
        String s2 = "integral";
        boolean isAnagram= true;

        for(char x: s1.toCharArray()){
        if(s2.indexOf(x)==-1){
            isAnagram= false;

        } else {
            isAnagram=true;
        }
        }
        if(isAnagram){
            System.out.println("Anagram is True ");

        }else{
            System.out.println("Anagram: False");
        }

    }

    /*Simpler way..
    *
    * Convert the strings to char using char [] s1arr= s1.toCharArray();
    * Sort both strings
    * apply .equals on the char arrays (IDK this...)
    *
    * */



}