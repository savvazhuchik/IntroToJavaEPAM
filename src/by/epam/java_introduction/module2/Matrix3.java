package by.epam.java_introduction.module2;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class Matrix3 {
    public static void main (String[] args) {

        int k = 3;
        int p = 1;

        int[][] matrix = {
                {2, -4, 1, 9, 0},
                {-1, 0, 7, 5, -3},
                {-4, -2, 6, 8, 4},
                {2, 8, -3, -2, 0},
                {-5, 2, 2, 1, -4}
        };

        for (int x = 0; x < 5; x++) {
            System.out.print(matrix[k-1][x] + "  ");
        }

        System.out.println();
        System.out.println("---------------------");

        for (int x = 0; x < 5; x++) {
            System.out.print(matrix[x][p-1] + "  ");
        }

    }
}
