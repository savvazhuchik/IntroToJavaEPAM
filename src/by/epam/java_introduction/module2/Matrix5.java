package by.epam.java_introduction.module2;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Matrix5 {
    public static void main (String[] args) {

        int n = 8;

        int[][] matrix = new int[n][n];

        int number = 1;

        for (int x = 0; x < n; x++) {
            for (int z = 0; z <= n - number; z++) {
                matrix[x][z] = number;
            }
            number++;
        }


        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(matrix[y][x] + " ");
            }
            System.out.println();
        }
    }
}
