package by.epam.java_introduction.module2;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Matrix15 {
    public static void main (String[] args) {
        int n = 5;

        int[][] matrix = new int[n][n];

        for (int x = 0; x < n; x++) {
            for(int z = 0; z < n; z++) {
                matrix[x][z] = (int) (10 + Math.random()*90);
            }
        }

        for (int x = 0; x < n; x++) {
            for(int z = 0; z < n; z++) {
                System.out.print(matrix[x][z] + " ");
            }
            System.out.println();
        }

        int maxValue = matrix[0][0];

        for (int x = 0; x < n; x++) {
            for (int z = 0; z < n; z++) {
                if (matrix[x][z] > maxValue) {
                    maxValue = matrix[x][z];
                }
            }
        }

        System.out.println("макс. число: " + maxValue);
        System.out.println("-----------------");

        for (int x = 0; x < n; x++) {
            for (int z = 0; z < n; z++) {
                if (matrix[x][z] % 2 != 0) {
                    matrix[x][z] = maxValue;
                }
            }
        }

        for (int x = 0; x < n; x++) {
            for(int z = 0; z < n; z++) {
                System.out.print(matrix[x][z] + " ");
            }
            System.out.println();
        }
    }
}
