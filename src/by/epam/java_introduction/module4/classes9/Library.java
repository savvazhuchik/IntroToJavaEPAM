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

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public ArrayList<String> getBooksByAuthor (String author) {
        ArrayList<String> result = new ArrayList<String>();
        Book[] books = this.books;
        for (int x = 0; x < books.length; x++) {
            for (int z = 0; z < books[x].getAuthors().length; z++) {
                String check = books[x].getAuthors()[z];
                if (author.equals(check)) {
                    result.add(books[x].toString());
                }
            }
        }
        return result;
    }

    public ArrayList<String> getBooksByPublisher (String publisher) {
        ArrayList<String> result = new ArrayList<String>();
        Book[] books = this.books;
        for (int x = 0; x < books.length; x++) {
            if (books[x].getPublisher().equals(publisher)) {
                result.add(books[x].toString());
            }
        }
        return result;
    }

    public ArrayList<String> getBooksNewerThan (int year) {
        ArrayList<String> result = new ArrayList<String>();
        Book[] books = this.books;
        for (int x = 0; x < books.length; x++) {
            if (books[x].getYearOfMade() >= year) {
                result.add(books[x].toString());
            }
        }
        return result;
    }
}
