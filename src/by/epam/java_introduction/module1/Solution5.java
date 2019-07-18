package by.epam.java_introduction.module1;

public class Solution5 {
    // Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    // данное значение длительности в часах, минутах и секундах в следующей форме:
    // ННч ММмин SSc.
    public static void main (String[] args) {
        int t = 67000; // количество секунд, которое прошло

        int hours = t / 3600;                                       // получаем количество часов
        int minutes = (t - (hours*3600)) / 60;                       // получаем количество минут
        int seconds = t - (hours*3600 + minutes*60);                   // получаем количество секунд
        System.out.println(hours + "ч " + minutes + "мин " + seconds + " с"); // вывод
    }
}
