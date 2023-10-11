package com.Lib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libraryapp extends Book {


    private static List<Book> books = new ArrayList<>(); //List to store the books added as Generic

    public Libraryapp(int id, int qty, String name, String author, String publisher, String genre) {
        super(id, qty, name, author, publisher, genre);
        books = new ArrayList<>(); //Inititalizing the list
//Just Want to change the commit here
    }
//FOLLOwing code highlight the incorrect usages and so much to learn
// of book objects and where to call what



    /*Issue 01 :  is a non-static method, but you're calling it in a static context
     in your main method. You should either make addBook static
     OR
     create an instance of Libraryapp to call it.*/
    public static void addBook(Book book) { //dd
        books.add(book);
    }

    public static void main(String[] args) {

//       Libraryapp libraryapp = new Libraryapp(1,2,"how to Pass any Test?",
//           "Meandyou","blah","Education"); // Creating an instance of the Library app..

        /*Issue 02
         * Incorrect way to call object*/
//        addBook book1 = new Book(1,2,"Think like me","Jerry",
//                "Muahpublishers","Education");
//        addBook book2 = new Book(2,1,"Hola hoops","Bablya",
//                "Muahpublishers","Education");
//        addBook book3 = new Book(3,3,"Thinkdigit","Tommy",
//                "Meowpublishers","Education");
//        addBook book4 = new Book(4,2,"Why i like gaming","Harry",
//                "Darkgamers","Fun");


//        Correct way
        Libraryapp.addBook(new Book(1, 2, "Think like me", "Jerry",
                "Muahpublishers", "Education"));
        Libraryapp.addBook(new Book(2, 1, "Hola hoops", "Bablya",
                "Muahpublishers", "Education"));
        Libraryapp.addBook(new Book(3, 3, "Thinkdigit", "Tommy",
                "Meowpublishers", "Education"));
        Libraryapp.addBook(new Book(3, 3, "Thinkdigit", "Tommy",
                "Meowpublishers", "Education"));

//// Issue 03
        /*Wanted to use Iterator however it returns me a reference instead*/
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()) {
            Book book = itr.next();
//            System.out.println(itr.next());  //ISSSUe
            System.out.println("Book ID: " + book.getId() + ", Book Name: " + book.getName());

//

//        for(Book x: books){
//            System.out.println("Book ID: "+book1.getId()+ "Book Name: "+book1.getName());
//            System.out.println("Book ID: "+book2.getId()+ "Book Name: "+book2.getName());
//            System.out.println("Book ID: "+book3.getId()+ "Book Name: "+book3.getName());
//            System.out.println("Book ID: "+book4.getId()+ "Book Name: "+book4.getName());
        }
    }
}

/*More about issue 03
*
* I'm sorry for the confusion. I misunderstood your question. Upon reviewing your code again, I see that you're using `itr.next()` twice in this section:

```java
while (itr.hasNext()) {
   Book book = itr.next();
   System.out.println(itr.next());
}
```

In the loop, you're calling `itr.next()` twice. This means that you're advancing the iterator by two elements in each iteration. This could lead to skipping every alternate book in the list.

You should only call `itr.next()` once and store it in a variable if you want to use the value:

```java
while (itr.hasNext()) {
   Book book = itr.next();
   System.out.println(book);
}
```

This way, you're using the same `Book` object that you retrieved from the iterator. Thank you for catching this mistake, and I apologize for any confusion caused by my previous response.
*
* */





