package by.epam.java_introduction.module2;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму

import java.util.ArrayList;
import java.util.Collections;

public class Matrix9 {
    public static void main(String[] args) {
        int n = 8;
        int[][] matrix = new int[n][n];
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= i && j + i < n) || (j <= i && j + i >= n - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(matrix[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[j] = sum[j] + matrix[i][j];
            }
        }
        for (int x = 0; x < n; x++) {
            System.out.print(sum[x] + " ");
        }
        System.out.println("");
        System.out.println("---------------------");

        int indexOfMax = 0;
        for (int x = 0; x < n; x++) {
            if (sum[x] > sum[indexOfMax]) indexOfMax = x;
        }
        System.out.println(indexOfMax);
    }
}
