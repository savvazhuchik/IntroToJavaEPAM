package by.epam.java_introduction.module4.classes9;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String[] authors;
    private String publisher;
    private int yearOfMade;
    private int numbOfPages;
    private int price;
    private String bindingType;
    private static int countOfBooks;

    public Book(String name, String[] authors, String publisher, int yearOfMade, int numbOfPages, int price, String bindingType) {
        countOfBooks++;
        this.id = countOfBooks;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfMade = yearOfMade;
        this.numbOfPages = numbOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }

    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
    @Override
    public String toString() {
        return "ID: " + this.id + " " + this.name + " " + Arrays.toString(authors);
    }
}
