package by.epam.java_introduction.module2;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

import java.util.ArrayList;
import java.util.Collections;

public class Matrix13 {
    public static void main (String[] args) {
        int n = 10;

        int[][] matrix = new int[n][n];

        for(int x = 0; x < n; x++) {
            for(int z = 0; z < n; z++) {
                matrix[x][z] = (int) (10 + Math.random()*90);
            }
        }

        for(int x = 0; x < n; x++) {
            for(int z = 0; z < n; z++) {
                System.out.print(matrix[x][z] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------------");

        for(int x = 0; x < n; x++) {
            ArrayList<Integer>list = new ArrayList<>();
            for(int z = 0; z < n; z++) {
                list.add(matrix[z][x]);
            }
            Collections.sort(list);
            for(int z = 0; z < n; z++) {
                matrix[z][x] = list.get(z); //
            }
        }


        for(int x = 0; x < n; x++) {
            for(int z = 0; z < n; z++) {
                System.out.print(matrix[x][z] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        for(int x = 0; x < n; x++) {
            ArrayList<Integer>list = new ArrayList<>();
            for(int z = 0; z < n; z++) {
                list.add(matrix[z][x]);
            }
            Collections.sort(list);
            for(int z = 0; z < n; z++) {
                matrix[n-z-1][x] = list.get(z); //
            }
        }


        for(int x = 0; x < n; x++) {
            for(int z = 0; z < n; z++) {
                System.out.print(matrix[x][z] + " ");
            }
            System.out.println();
        }

    }
}
