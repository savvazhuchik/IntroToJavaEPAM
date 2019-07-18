package by.epam.java_introduction.module2;

// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
// положительных и нулевых элементов.

public class Arrays3 {
    public static void main (String[] args) {
        int n = 20;
        int[] array = new int[n];
        int negCount = 0;
        int posCount = 0;
        int zeroCount = 0;

        for (int x = 0; x < array.length; x++) {
            array[x] = x;
        }

        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
            if (array[x] == 0) { zeroCount++; }
            if (array[x] < 0) { negCount++; }
            if (array[x] > 0) { posCount++; }
        }
        System.out.println("Колиество нулей: " + zeroCount);
        System.out.println("Количество отрицательнх чисел: " + negCount);
        System.out.println("Количество положительных чисел: " + posCount);
    }
}
