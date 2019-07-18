package by.epam.java_introduction.module4.Classes2;

// Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса.

public class Solution {
    public static void main (String[] args) {
        Test2.initialize();
        System.out.println(Test2.getNum1());
        System.out.println(Test2.getNum2());
        Test2.setNum1(400);
        Test2.setNum2(200);
        System.out.println(Test2.getNum1());
        System.out.println(Test2.getNum2());
    }
}
