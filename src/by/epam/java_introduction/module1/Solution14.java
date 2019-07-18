package by.epam.java_introduction.module1;

public class Solution14 {
    // Найти сумму квадратов первых ста чисел.
    public static void main (String[] args) {
        int sum = 0;
        for (int x = 0; x < 100; x++) {
            sum += x*x;
        }
        System.out.println(sum);
    }
}
