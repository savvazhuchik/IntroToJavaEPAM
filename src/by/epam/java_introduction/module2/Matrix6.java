package by.epam.java_introduction.module2;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Matrix6 {
    public static void main (String[] args) {

        int n = 8;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= i && j + i < n) || (j <= i && j + i >= n - 1)) {
                    matrix[i][j] = 1;
                } else { matrix[i][j] = 0; }
            }
        }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(matrix[y][x] + " ");
            }
            System.out.println();
        }
    }
}
