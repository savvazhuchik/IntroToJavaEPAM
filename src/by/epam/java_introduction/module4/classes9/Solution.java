package by.epam.java_introduction.module4.classes9;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import java.util.ArrayList;
import java.util.Arrays;

public class
Solution {
    public static void main (String[] args) {
        String[] authors1 = {"Эйнштейн", "Я"};
        String[] authors2 = {"Петя", "Мама"};
        String[] authors3 = {"Крокинг", "Клокин"};
        Book book1 = new Book("Азбука",authors1,"ПублГруп", 1997, 500, 20, "жесткий");
        Book book2 = new Book("Мурка",authors1,"ПублГруп", 1992, 390, 20, "жесткий");
        Book book3 = new Book("Жопка",authors2,"ПечатаемГруп", 2000, 200, 29, "жесткий");
        Book book4 = new Book("ЕПАМ",authors3,"ПечатаемГруп", 2012, 720, 19, "мягкий");
        Book book5 = new Book("Савва - Путь к успеху)0",authors3,"ПечатаемГруп", 2019, 500, 99, "жесткий");

        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;

        Library library = new Library(books);

        ArrayList <String> check1 = library.getBooksByAuthor("Клокин");
        for (int x = 0; x < check1.size(); x++) {
            System.out.println(check1.get(x));
        }

        System.out.println("--------------------");

        ArrayList <String> check2 = library.getBooksByPublisher("ПублГруп");
        for (int x = 0; x < check2.size(); x++) {
            System.out.println(check2.get(x));
        }

        System.out.println("--------------------");

        ArrayList <String> check3 = library.getBooksNewerThan(2000);
        for (int x = 0; x < check3.size(); x++) {
            System.out.println(check3.get(x));
        }
    }
}
