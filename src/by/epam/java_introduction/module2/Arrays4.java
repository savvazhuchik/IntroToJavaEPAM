package by.epam.java_introduction.module2;

//  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Arrays4 {
    public static void main (String[] args) {
        int n = 20;
        int[] array = new int[n];

        for (int x = 0; x < array.length; x++) {
            array[x] = x;
        }

        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x] > max) {
                max = array[x];
                maxIndex = x;
            }
            if (array[x] < min) {
                min = array[x];
                minIndex = x;
            }
        }

        array[minIndex] = max;
        array[maxIndex] = min;

        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }
    }
}
