package by.epam.java_introduction.module2;

// 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class Decomposition2 {
    public static void main (String[] args) {
        int a = 369;
        int b = 123;
        int c = 246;
        int d = 246;

        System.out.println("Наибольший общий делитель: " + greatestCommonDivisorOfFours(a, b, c, d));
    }

    private static int greatestCommonDivisor(int a, int b) {
        while (b !=0) {             // алгоритм Эвклида
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    private static int greatestCommonDivisorOfFours(int a, int b, int c, int d) {
        return greatestCommonDivisor(a, greatestCommonDivisor(b, greatestCommonDivisor(c, d)));
    }
}
