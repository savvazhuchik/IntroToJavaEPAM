package by.epam.java_introduction.module4.Classes5;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Counter {
    private int count;
    private final int DEFAULTVALUE = 10;

    public Counter(int count) {
        this.count = count;
    }

    public Counter() {
        this.count = DEFAULTVALUE;
    }

    public void countPlusOne() {
        this.count++;
    }
    public void countOneMinus() {
        this.count--;
    }
    public void countUpFor(int x) {
        this.count += x;
    }
    public void countDownFor(int x) {
        this.count -= x;
    }
    public void printCount() {
        System.out.println(this.count);
    }
}
