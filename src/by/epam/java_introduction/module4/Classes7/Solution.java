package by.epam.java_introduction.module4.Classes7;

//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

public class Solution {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,2,7,5,0,0);
        System.out.println(triangle.getSquare());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getCrossMed());
    }
}
