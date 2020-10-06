package com.company;

import java.util.Scanner;

public class Interaction {
    Admin admin;
    User user;

    Output out = new Output();

    Scanner scanner = new Scanner(System.in);

    public Interaction(Admin admin_, User user_) {
        admin = admin_;
        user = user_;
    }

    public void getBook() throws Exception{
        out.outName();
        String name = scanner.nextLine();
        if (name.length() == 0) throw new Exception("Название не было введено!");
        String author = admin.getAuthorByName(name);
        if (author.length() == 0) throw new Exception("Такой книги в библиотеке нет!");
        admin.delete(new Book(name, author));
        user.add(new Book(name, author));
    }

    public void returnBook() throws Exception {
        out.outName();
        String name = scanner.nextLine();
        if (name.length() == 0) throw new Exception("Название не было введено!");
        String author = user.getAuthorByName(name);
        if (author.length() == 0) throw new Exception("Такой книги в библиотеке нет!");
        user.delete(new Book(name, author));
        admin.add(new Book(name, author));
    }
}
