package by.epam.java_introduction.module4.classes8;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале


public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private long creditCardNumber;
    private long bankAccountNumber;
    private static int countOfCustomers;

    public Customer(String surname, String name, String patronymic, long creditCardNumber, long bankAccountNumber) {
        countOfCustomers++;
        this.id = countOfCustomers;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " " + this.surname + " " + this.name.charAt(0) + ". " + this.patronymic.charAt(0) + ".";
    }
}
