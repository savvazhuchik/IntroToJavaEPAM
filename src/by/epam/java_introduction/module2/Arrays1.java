package by.epam.java_introduction.module2;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Arrays1 {
    public static void main (String[] args) {
        int[] array = new int[20];
        int k = 3;
        int sum = 0;

        for (int x = 0; x < array.length; x++) {
            array[x] = x;                            // а почему бы собсна и нет
        }

        for (int x = 0; x < array.length; x++) {
            if ((array[x] % k) == 0) sum += array[x];
        }

        System.out.println(sum);
    }
}
