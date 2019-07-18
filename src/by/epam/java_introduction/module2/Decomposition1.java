package by.epam.java_introduction.module2;

// 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

public class Decomposition1 {
    public static void main (String[] args) {
        int a = 120;
        int b = 46;

        System.out.println("Наибольший общий делитель: " + greatestCommonDivisor(a, b));
        System.out.println("Наименьшее общее кратное: " + leastCommonMultiple(a, b));
    }

    private static int greatestCommonDivisor(int a, int b) {
        while (b !=0) {             // алгоритм Эвклида
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private static int leastCommonMultiple(int a, int b) {
        return (a * b) / greatestCommonDivisor(a, b);
    }
}
