package by.epam.java_introduction.module4.Classes2;

public class Test2 {
    private static int num1;
    private static int num2;

    public static void initialize() {
        num1 = 100;
        num2 = 100;
    }
    public Test2(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public static int getNum1() {
        return num1;
    }

    public static void setNum1(int num1) {
        Test2.num1 = num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int num2) {
        Test2.num2 = num2;
    }
}
