package by.epam.java_introduction.module4.Classes1;

public class Test1 {
    private static int num1 = 764;
    private static int num2 = 241;

    public static void toScreen() {
        System.out.print(num1 + " " + num2);
        System.out.println();
    }
    public static void changeNum1(int newNumber) {
        num1 = newNumber;
    }
    public static void changeNum2(int newNumber) {
        num2 = newNumber;
    }
    public static void sum() {
        System.out.print(num1+num2);
        System.out.println();
    }
    public static void max() {
        System.out.print(Math.max(num1,num2));
        System.out.println();
    }
}
