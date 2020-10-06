package com.company;

import java.util.Scanner;

public class Admin extends Catalog implements Actions {

    Output out = new Output();
    Scanner scanner = new Scanner(System.in);

    public Admin() {
        super();
    }

    public void addNewBook() throws Exception {
        out.outName();
        String name = scanner.nextLine();
        if (name.length() == 0) throw new Exception("Отсутствует назввание книги!");
        out.outAuthor();
        String author = scanner.nextLine();
        if (author.length() == 0) author = "Нет данных";
        add(new Book(name, author));
    }

    public void add(Book book) throws Exception {
        if (!isBookAviable(book)) {
            addBook(book);
        }
        else throw new Exception("Данная книга уже есть в библиотеке!");
    }

    public void delete(Book book) throws Exception {
        if (isBookAviable(book)) {
            deleteBook(book);
        }
        else throw new Exception("Такой книги в библиотеке нет!");
    }

    public void getListOfBooks() {
        output();
    }
}
