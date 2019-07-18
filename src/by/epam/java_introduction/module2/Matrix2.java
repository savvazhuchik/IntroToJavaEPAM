package by.epam.java_introduction.module2;

//  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class Matrix2 {
    public static void main (String[] args) {
        int[][] matrix = {
                {2, -4, 1, 9, 0},
                {-1, 0, 7, 5, -3},
                {-4, -2, 6, 8, 4},
                {2, 8, -3, -2, 0},
                {-5, 2, 2, 1, -4}
        };

        for (int x = 0; x < 5; x++) {
            System.out.print(matrix[x][x] + "  ");
        }

    }
}
