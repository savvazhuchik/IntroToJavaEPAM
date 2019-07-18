package by.epam.java_introduction.module2;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Arrays5 {
    public static void main (String[] args) {
        double[] array = new double[20];

        for (int x = 0; x < array.length; x++) {
            array[x] = Math.random()*10;
        }

        for (int x = 0; x < array.length; x++) {
            if (array[x] > x) System.out.println(array[x]);
        }
    }
}
