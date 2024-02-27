package com.Lib;

public class Book {

private int id;
private int qty;
private String name;
private String author;
private String publisher;
private String genre;

    public Book(int id, int qty, String name, String author, String publisher, String genre) {
        this.id = id;
        this.qty = qty;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
