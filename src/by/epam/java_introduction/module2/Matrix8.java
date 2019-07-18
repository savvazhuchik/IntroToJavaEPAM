package by.epam.java_introduction.module2;

// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
// на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
// пользователь с клавиатуры

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 8;
        int[][] matrix = new int[n][n];


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

        System.out.println("---------------------------------");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        num1--;
        num2--;

        for (int x = 0; x < n; x++) {
            int change = matrix[x][num1];
            matrix[x][num1] = matrix[x][num2];
            matrix[x][num2] = change;
        }

        System.out.println("---------------------------------");
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(matrix[y][x] + " ");
            }
            System.out.println();
        }
    }
}
