package by.epam.java_introduction.module2;

// 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.

public class Decomposition3 {
    public static void main (String[] args) {
        int a = 10;         // сторона пр. шестиугольника
        System.out.println("Площадь правильного шестиугольника: " + areaOfEqTriangle(a)*6);
    }

    private static double areaOfEqTriangle(int a) {
        return ((a*a)*Math.sqrt(3)) / 4;
    }
}
