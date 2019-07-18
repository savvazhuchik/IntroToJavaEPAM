package by.epam.java_introduction.module4.classes8;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.util.ArrayList;

public class Solution {
    public static void main (String[] args) {
        Customer customer1 = new Customer("Жучик", "Савва", "Александрович", 4848444455556666L, 5454545);
        Customer customer2 = new Customer("Ангел", "Савва", "Александрович", 9848444455556666L, 5454545);
        Customer customer3 = new Customer("Яшка", "Савва", "Александрович", 7848444455556666L, 5454545);
        Customer customer4 = new Customer("Бучка", "Савва", "Александрович", 5848444455556666L, 5454545);
        Customer customer5 = new Customer("Жучик", "Савва", "Александрович", 3848444455556666L, 5454545);

        Customer[] list = new Customer[5];
        list[0] = customer1;
        list[1] = customer2;
        list[2] = customer3;
        list[3] = customer4;
        list[4] = customer5;

        Buyers test = new Buyers(list);
        ArrayList<String> result = test.getSortedCustomers();
        ArrayList<String> result2 = test.getCustomersWithCardNumber(3000000000000000L, 5000000000000000L);

        for (int x = 0; x < result.size(); x++) {
            System.out.println(result.get(x));
        }
        System.out.println("----------------");
        for (int x = 0; x < result2.size(); x++) {
            System.out.println(result2.get(x));
        }
    }
}
