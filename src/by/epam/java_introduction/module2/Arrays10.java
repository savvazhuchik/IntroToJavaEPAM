package by.epam.java_introduction.module2;

// Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.ArrayList;

public class Arrays10 {
    public static void main (String[] args) {
        int n = 20;
        ArrayList<Integer> array = new ArrayList<>();

        for (int x = 0; x < n; x++) {
            array.add(x);
        }

        for (int x = 0; x < array.size(); x=x+2) {
            array.set(x, 0);
        }

        for (Integer x : array) {
            System.out.println(x);
        }
    }
}
