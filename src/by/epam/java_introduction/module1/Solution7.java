package by.epam.java_introduction.module1;

public class Solution7 {
    //  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    // он прямоугольным.
    public static void main (String[] args) {
        int degres1 = 45;
        int degres2 = 45;

        int degres3 = 180 - (degres1 + degres2);

        if (degres3 <= 0) {
            System.out.println("Треугольник не существует");
        } else { System.out.println("Треугольник существует"); }
        if ((degres1 == 90) || (degres2 == 90) || (degres3 == 90)) System.out.println("Треугольник прямоугольный");
    }
}
