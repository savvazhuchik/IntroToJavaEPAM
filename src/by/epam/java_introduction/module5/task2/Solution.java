package by.epam.java_introduction.module5.task2;

//Задача 2.
//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
//нескольких товаров.

public class Solution {
    public static void main(String[] args) {
        Payment payment = new Payment("Green");

        payment.addPurchase("Молоко", 1);
        payment.addPurchase("Яйца", 1);
        payment.addPurchase("Хлеб", 1);
        payment.addPurchase("Пиво", 2);
        payment.addPurchase("Виски", 10);
        payment.addPurchase("Кола", 2);
        payment.addPurchase("Лёд", 2);

        payment.getCheck();
    }
}
