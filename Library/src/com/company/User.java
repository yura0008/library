package com.company;

public class User extends Catalog implements Actions {
    public User() {
        super();
    }

    public void add(Book book) {
        addBook(book);
    }

    public void delete(Book book) throws Exception {
        if (isBookAviable(book)) {
            deleteBook(book);
        }
        else throw new Exception("Такой книги у пользователя нет!");
    }

    public void getListOfBooks() {
        output();
    }
}
