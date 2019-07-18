package by.epam.java_introduction.module2;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

import java.util.ArrayList;

public class Sort1 {
    public static void main (String[] args) {
        ArrayList <Integer> array1 = new ArrayList<>();
        ArrayList <Integer> array2 = new ArrayList<>();

        int k = 8;

        for (int x = 0; x < 20; x++) {
            array1.add(x);
        }

        for (int x = 50; x < 60; x++) {
            array2.add(x);
        }
        for (int x = 0; x < array2.size(); x++) {
            array1.add(k,array2.get(x));
        }

        for (int x = 0; x < array1.size(); x++) {
            System.out.print(array1.get(x) + " ");
        }

    }
}
