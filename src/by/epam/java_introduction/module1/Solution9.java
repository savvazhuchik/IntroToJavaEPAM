package by.epam.java_introduction.module1;

public class Solution9 {
    // Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void main (String[] args) {
        int x1 = 1;
        int x2 = -2;
        int x3 =  -4;
        int y1 = 8;
        int y2 = -7;
        int y3 = -17;

        if (((x1-x3)/(x2-x3)) == ((y1-y3)/(y2-y3))) {           // источник доказательства: http://www.pm298.ru/reshenie/fha0327.php
            System.out.println("Точки расположены на одной прямой");
        } else { System.out.println("Точки не расположены на одной прямой"); }
    }
}
