package by.epam.java_introduction.module2;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Matrix4 {
    public static void main (String[] args) {

        int n = 8;

        int[][] matrix = new int[n][n];

        for (int y = 0; y < n; y= y + 2) {
            for (int x = 1; x <=n; x++) {
                matrix[y][x-1] = x;
            }
        }

        for (int y = 1; y <= n; y= y + 2) {
            for (int x = 0; x < n; x++) {
                matrix[y][x] = n-x;
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
