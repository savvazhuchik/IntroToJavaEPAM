package by.epam.java_introduction.module1;

public class Solution6 {
    // Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    // принадлежит закрашенной области, и false — в противном случае
    public static void main (String[] args) {
        System.out.println(check(1,2));
    }

    public static String check(int x, int y) {
        if ((x == 0) && (y == -1)) return "false";                          // проверяю, находится ли точка в незакрашенной "дырке"
        if ((x >= -4) && (x <= 4) && (y >= -3) && (y <= 0)) return "true";  // проверяю, находится ли точка в прямоугольнике ниже оси X
        if ((x >= -2) && (x <= 2) && (y >= 0) && (y <= 4)) return "true";   // проверяю, находится ли точка в прямоугольнке выше оси X
        return "false";
    }
}
