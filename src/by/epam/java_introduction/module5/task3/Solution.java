package by.epam.java_introduction.module5.task3;

//Задача 3.
//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.

public class Solution {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.initializeCalendar("january");

        calendar.addNote(1, "Новый год, епта!");

        calendar.print();
    }
}
