package by.epam.java_introduction.module4.Classes6;

//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.

public class Solution {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        time1.toScreen();
        time1.plusMinute(80);
        time1.plusSecond(3650);
        time1.plusHour(20);
        time1.toScreen();
    }
}
