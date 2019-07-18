package by.epam.java_introduction.module1;

public class Solution10 {
    // Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    // отверстие.
    public static void main (String[] args) {
        int a = 10;   // размеры отверстия
        int b = 8;

        int x = 10;    // размеры кирпича
        int y = 12;
        int z = 10;

        if (((a >= x) && (b >= y))
                || ((a >= y) && (b >= x))
                || ((a >= x) && (b >= z))
                || ((a >= z) && (b >= x))
                || ((a >= y) && (b >= z))
                || ((a >= z) && (b >= y)))
        { System.out.println("Пройдёт");
        } else { System.out.println("Не пройдёт"); }
    }
}
