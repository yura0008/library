package com.company;

import java.util.ArrayList;

public abstract class Catalog {
    private ArrayList<Book> bookList = null;

    public Catalog() {
        bookList = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void deleteBook(Book book) {
        int id = -1;
        for (Book b : bookList) {
            if (b.getBookName().intern() == book.getBookName().intern()
                    && b.getAuthor().intern() == book.getAuthor().intern()) id = bookList.indexOf(b);
        }
        if (id != -1) bookList.remove(id);
    }

    public boolean isBookAviable(Book book) {
        for (Book b : bookList) {
            if (b.getBookName().intern() == book.getBookName().intern()
                    && b.getAuthor().intern() == book.getAuthor().intern()) return true;
        }
        return false;
    }

    public String getAuthorByName(String name) {
        for (Book book : bookList) {
            //System.out.println("!!! " + book.getBookName());
            if (book.getBookName().intern() == name.intern()) return book.getAuthor();
        }
        return "";
    }

    public void output() {
        for (Book book : bookList) {
            System.out.println("Название: " + book.getBookName() + "   Автор: " + book.getAuthor());
        }
        System.out.println();
    }
}
