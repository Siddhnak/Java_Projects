package com.Lib;

import java.util.ArrayList;
import java.util.List;

public class Libraryapp extends Book {


    private static List<Book> books = new ArrayList<>(); //List to store the books added as Generic

    public Libraryapp(int id, int qty, String name, String author, String publisher, String genre) {
        super(id, qty, name, author, publisher, genre);
//        books = new ArrayList<>(); //Inititalizing the list
//Just Want to change the commit here
    }

    public void addBook(Book book) {
//            books.add(book);
        book = new Book(1, 1, "Kisan", "Babu Bhaiya", "kakaji", "Thriller");
        book = new Book(2, 2, "A light Elephant", " Bhaiya", "kakaji", "Thriller");
        book = new Book(3, 1, "Think like an otter", "Babu Kaka", "kakaji", "Thriller");
        book = new Book(4, 1, "Kisan unlocked", "Qamar Begh", "kakaji", "Thriller");


    }

    public static void main(String[] args) {
        addBook
    }

//
//        Iterator<Book> itr = books.iterator();
////
//        while (itr.hasNext()) {
//           Book book = itr.next();
//            System.out.println(itr.next());
////
//        }
//
//    }
//


    }
