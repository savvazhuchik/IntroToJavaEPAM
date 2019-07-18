package by.epam.java_introduction.module2;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Matrix14 {
    public static void main (String[] args) {
        int n = 10;

        int[][] matrix = new int[n][n];

        for (int z = 0; z < n; z++) {
            for (int x = 0; x < n; x++) {
                matrix[z][x] = 0;
            }
        }

        for (int x = 0; x < n; x++) {
            int numOfOnes = x+1;
            int countOfAddesOnes = 0;                       // ухх, 2 часа
            while (countOfAddesOnes < numOfOnes) {
                int index = (int) (Math.random() * n);
                if (matrix[index][x] == 0) {
                    matrix[index][x] = 1;
                    countOfAddesOnes++;
                }
            }
        }

        for (int x = 0; x < n; x++) {
            for (int z = 0; z < n; z++) {
                System.out.print(matrix[x][z] + " ");
            }
            System.out.println();
        }
    }
}
