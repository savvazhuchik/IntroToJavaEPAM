package by.epam.java_introduction.module1;

public class Solution13 {
    //  Вычислить значения функции на отрезке [а,b] c шагом h
    public static void main (String[] args) {
        int a = -15;
        int b = 30;
        int h = 2;
        int y = 0;
        for (int x = a; x <= b; x=x+h) {
            if (x > 2) y = x;
            if (x <= 2) y = -x;
            System.out.println(y);
        }
    }
}
