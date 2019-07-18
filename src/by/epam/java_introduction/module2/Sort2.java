package by.epam.java_introduction.module2;

// Даны две последовательности
// Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

import java.util.ArrayList;
import java.util.Collections;

public class Sort2 {
    public static void main (String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList <Integer> array2 = new ArrayList<>();

        for (int x = 0; x < 20; x=x+2) {
            array1.add(x);
        }

        for (int x = 0; x < 15; x++) {
            array2.add(x);
        }

        for (int x = 0; x < array2.size(); x++) {
            array1.add(array2.get(x));
        }

        Collections.sort(array1);

        for (int x = 0; x < array1.size(); x++) {
            System.out.print(array1.get(x) + " ");
        }
    }
}
