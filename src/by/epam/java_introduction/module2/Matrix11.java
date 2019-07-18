package by.epam.java_introduction.module2;

// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз

public class Matrix11 {
    public static void main (String[] args) {
        int i = 10;
        int j = 20;

        int[][] matrix = new int[i][j];

        for(int x = 0; x < i; x++) {
            for(int z = 0; z < j; z++) {
                matrix[x][z] = (int) (Math.random()*16);
            }
        }

        for(int x = 0; x < i; x++) {
            for(int z = 0; z < j; z++) {
                System.out.print(matrix[x][z] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------------");

        for(int x = 0; x < i; x++) {
            int countOfFive = 0;
            for(int z = 0; z < j; z++) {
                if(matrix[x][z] == 5) countOfFive++;
                if(countOfFive >= 3) {
                    System.out.print(x+1 + " ");
                    countOfFive = 0;
                }
            }
        }
    }
}
