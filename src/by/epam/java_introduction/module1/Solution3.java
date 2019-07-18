package by.epam.java_introduction.module1;

public class Solution3 {
    //  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void main (String[] args) {
        int x = 5;
        int y = 10;

        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) + Math.tan(x*y);

        System.out.println(result);
    }
}
