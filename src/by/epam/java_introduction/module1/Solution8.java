package by.epam.java_introduction.module1;

public class Solution8 {
    // Найти max{min(a, b), min(c, d)}.
    public static void  main (String[] args) {
        int a = 4;
        int b = -2;
        int c = 18;
        int d = 0;

        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);

        int result = Math.max(min1, min2);

        System.out.println(result);
    }
}
