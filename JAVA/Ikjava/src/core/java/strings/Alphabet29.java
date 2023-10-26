package core.java.strings;

public class Alphabet29 {

        public static void main(String[] args) {
            String str = "The quick brown fox jumps over the lazy dog.";
            String alphabet = "abcdefghijklmnopqrstuvwxyz";

            for (char letter : alphabet.toCharArray()) {
                int index = str.indexOf(letter);
                System.out.print((index != -1) ? index : "  ");
            }
        }


}
