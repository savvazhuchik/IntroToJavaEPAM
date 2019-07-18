package by.epam.java_introduction.module2;

// Сформировать квадратную матрицу порядка N по правилу:

public class Matrix7 {
    public static void main (String[] args) {

        int n = 10;
        int countOfPositiveNumb = 0;

        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin(((i*i)-(j*j))/n);
            }
        }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (matrix[y][x] > 0) countOfPositiveNumb++;
                System.out.printf("%.2f", matrix[y][x]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        System.out.println("Кол-во положительных чисел: " + countOfPositiveNumb);
    }
}
