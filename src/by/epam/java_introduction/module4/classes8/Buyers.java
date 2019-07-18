package by.epam.java_introduction.module4.classes8;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Buyers {
    private Customer[] customers;

    public Buyers(Customer[] customers) {
        this.customers = customers;
    }

    public ArrayList<String> getSortedCustomers () {         // возвращает отсортированный по алфавиду список покупателей
        Customer[] customersList = this.customers;
        ArrayList<String> result = new ArrayList<>();
        Arrays.sort(customersList, Comparator.comparing(Customer::getSurname));
        for (int x = 0; x < customersList.length; x++) {
            result.add(customersList[x].toString());
        }
        return result;
    }

    public ArrayList<String> getCustomersWithCardNumber (long a, long b) {
        Customer[] customersList = this.customers;
        ArrayList<String> result = new ArrayList<>();
        for (int x = 0; x < customersList.length; x++) {
            if ((customersList[x].getCreditCardNumber() >= a) && (customersList[x].getCreditCardNumber() <= b)) {
                result.add(customersList[x].toString());
            }
        }
        return result;
    }
}
