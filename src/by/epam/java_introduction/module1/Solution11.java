package by.epam.java_introduction.module1;

public class Solution11 {
    // Вычислить значение функции:
    public static void main (String[] args) {
        int x = 7;
        double result = 0;
        if (x <= 3) result = x*x - 3*x + 9;
        if (x > 3) result = 1 / (Math.pow(x,3) + 6);

        System.out.println(result);
    }
}
