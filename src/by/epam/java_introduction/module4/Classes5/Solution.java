package by.epam.java_introduction.module4.Classes5;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Solution {
    public static void main (String[] args) {
        Counter counter = new Counter();
        counter.printCount();
        counter.countPlusOne();
        counter.printCount();
        counter.countUpFor(10);
        counter.printCount();
        counter.countOneMinus();
        counter.printCount();

        Counter counter1 = new Counter(100);
        counter1.countDownFor(50);
        counter1.printCount();
    }
}
