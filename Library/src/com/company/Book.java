package com.company;

public class Book {
    private final String bookName;
    private final String author;

    public Book(String newBookName, String newAuthor) {
        bookName = newBookName;
        author = newAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
}
