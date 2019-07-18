package by.epam.java_introduction.module1;

public class Solution2 {
    // Вычислить значение выражения по формуле (все переменные принимают действительные значения)
    public static void main (String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        double result = ((b + Math.sqrt((b*b)+(4*a*c))) / (2 * a)) - (a*a*a*c) + (1/(b*b));

        System.out.println(result);
    }
}
