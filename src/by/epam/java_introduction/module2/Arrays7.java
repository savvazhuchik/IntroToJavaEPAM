package by.epam.java_introduction.module2;

//7. Даны действительные числа
//a a an
//, , ,
//1 2 
//. Найти
//max( , , , )

import java.util.ArrayList;
import java.util.Collections;

public class Arrays7 {
    public static void main(String[] args) {
        int[] array = {-3, -5, 2, 17, 0, 9, -7, 3, 2, 15};

        printResult(array);
    }

    public static void printResult(int[] array) {
        int max = array[0];
        int indexOfMax = 0;
        for (int x = 0; x < array.length/2; x++) {
            int temp = array[x]+array[array.length-x-1];
            if (temp > max) {
                max = temp;
                indexOfMax = x;
            }
        }
        System.out.println(array[indexOfMax] + " " + array[array.length - indexOfMax - 1]);
    }
}
