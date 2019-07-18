package by.epam.java_introduction.module2;

// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
// числом. Подсчитать количество замен.

public class Arrays2 {
    public static void main (String[] args) {
        int[] array = new int[20];
        int z = 10;
        int replacementsCount = 0;

        for (int x = 0; x < array.length; x++) {
            array[x] = x;
        }

        for (int x = 0; x < array.length; x++) {
            if (array[x] > z) {
                array[x] = z;
                replacementsCount++;
            }
        }

        System.out.println(replacementsCount);
    }
}
