package by.epam.java_introduction.module2;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

public class Matrix1 {
    public static void main (String[] args) {
        int[][] matrix = {
                {2, -4, 1, 9, 0},
                {-1, 0, 7, 5, -3},
                {-4, -2, 6, 8, 4},
                {2, 8, -3, -2, 0},
                {-5, 2, 2, 1, -4}
        };

        for (int x = 0; x < 5; x=x+2) {
            if (matrix[0][x] > matrix[4][x]) {
                for (int z = 0; z < 5; z++) {
                    System.out.println(matrix[z][x]);
                }
                System.out.println("----------------------------");
            }
        }

    }
}
