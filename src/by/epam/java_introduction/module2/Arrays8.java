package by.epam.java_introduction.module2;

// дана последовательность. выбросить те, которые равны минимальному из этой последовательности

import java.util.ArrayList;
import java.util.Collections;

public class Arrays8 {
    public static void main (String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int arrayLength = 20;
        int minOfArray;

        for (int x = 0; x < arrayLength; x++) {
            array.add(x+10);
        }

        array.set(5, 10);
        array.set(8, 10);

        minOfArray = Collections.min(array);

        for (int x = 0; x < array.size(); x++) {
            if (array.get(x).equals(minOfArray)) array.remove(x);
        }

        for (int x = 0; x < array.size(); x++) {
            System.out.println(array.get(x));
        }
    }
}
