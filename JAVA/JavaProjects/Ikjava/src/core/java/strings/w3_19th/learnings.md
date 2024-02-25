<details>
<summary>this is the code </summary>


    +hello there
        +nested things
    +hi there

```
package core.java.strings;

public class IndexofChar19 {        
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
        }}
"
this is the output

"36 10 7 40 2 16 42 1 6 20 8 35 22 14 12 23 4 11 24 0 5 27 13 18 38 37
[C@448139f0"
how come 36 the first index?
is it the char value or what?<detail>this is the code

"
package core.java.strings;

public class IndexofChar19 {        
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
        }}
```

this is the output

"36 10 7 40 2 16 42 1 6 20 8 35 22 14 12 23 4 11 24 0 5 27 13 18 38 37
[C@448139f0"
how come 36 the first index?
is it the char value or what?



</details> 

<details>

<summary>hola hoops</summary>


    thanks
        +down the line
    +howling
</details>