package core.java.strings.w3_19th;

public class IndexofChar19 {

    // 36 mins spent researching...and understanding..

//  WELCOME FUTURE SELF ALL THE BEST TO YOU AND PUT YOUR THOUGHTS HERE.. 26 OCT 2021

//        public static void main(String[] args) {
//            String sen = "Didi loves to play khokho and do maSTI";
//            String str = "abcdefghijklmnopqrstuvwxyz";
//            char [] strchar = str.toCharArray();
//            for (char x : strchar) {
//                int index = sen.indexOf(x);
//                System.out.print(index != -1 ? index : " ");
//            }
//        }

//    public class AlphabetIndexFinder {
        public static void main(String[] args) {
            String sampleString = "The quick brown fox jumps over the lazy dog.";

            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            alphabet = alphabet.toLowerCase();

            sampleString = sampleString.toLowerCase();

            for (char letter : alphabet.toCharArray()) {
                int index = sampleString.indexOf(letter);
                System.out.print(index != -1 ? index + " " : "   ");
            }
//            System.out.println("\n"+(alphabet.toCharArray()).toString());


            System.out.println();
        }
//    }



}
