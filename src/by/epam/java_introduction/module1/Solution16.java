package by.epam.java_introduction.module1;

public class Solution16 {
    // Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид:
    public static void main (String[] args) {
        int[] array = {-2, 7, 14, -28, 97, 145}; // числовой ряд
        int e = 3;
        double sum = 0;

        for (int x = 0; x < array.length; x++) {
            double a = (1/(Math.pow(2, array[x]))) + (1/(Math.pow(3,array[x]))); // приводим к общему виду
            if (a >= e) sum+=a;
        }

        System.out.println(sum);
    }
}
