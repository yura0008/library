package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Admin admin = new Admin();
        User user = new User();
        Interaction interaction = new Interaction(admin, user);

        admin.addNewBook();
        //admin.addNewBook();
        admin.addNewBook();

        //admin.getListOfBooks();

        interaction.getBook();

        System.out.println("Оставшиеся книги в библиотеке ->");
        admin.getListOfBooks();

        System.out.println("Книги у пользователя ->");
        user.getListOfBooks();

        interaction.returnBook();

        System.out.println("Оставшиеся книги в библиотеке ->");
        admin.getListOfBooks();

        System.out.println("Книги у пользователя ->");
        user.getListOfBooks();
    }
}
