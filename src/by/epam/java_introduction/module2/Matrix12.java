package by.epam.java_introduction.module2;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Matrix12 {
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
            ArrayList<Integer> list = new ArrayList<>();
            for(int z = 0; z < n; z++) {
                list.add(matrix[x][z]);
            }
            Collections.sort(list);
            for(int z = 0; z < n; z++) {
                matrix[x][z] = list.get(z);
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
            ArrayList<Integer> list = new ArrayList<>();
            for(int z = 0; z < n; z++) {
                list.add(matrix[x][z]);
            }
            Collections.sort(list);
            for(int z = 0; z < n; z++) {
                matrix[x][n-z-1] = list.get(z);
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
