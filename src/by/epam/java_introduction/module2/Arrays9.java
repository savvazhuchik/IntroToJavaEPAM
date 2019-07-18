package by.epam.java_introduction.module2;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
// чисел несколько, то определить наименьшее из них.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrays9 {
    public static void main (String[] args) {
        int[] array = {1, 2, 4, 4, 5, 6, 8, 8, 8, 9, 10};
        printResult(array);
    }

    public static void printResult(int[] array) {
        int[] newArray = new int[array.length];
        int indexOfMax = 0;
        for(int x = 0; x < array.length; x++) {
            int countOfNumber = 0;
            for(int z = 0; z < array.length; z++) {
                if(array[z] == array[x]) {
                    countOfNumber++;
                }
            }
            newArray[x] = countOfNumber;
        }
        for (int x = 0; x < newArray.length; x++) {
            int max = newArray[0];
            if (newArray[x] > max) {
                max = newArray[x];
                indexOfMax = x;
            }
        }
        System.out.println("Наиболее повторяющиеся число: " + array[indexOfMax]);
    }
}
