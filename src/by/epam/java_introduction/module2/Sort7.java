package by.epam.java_introduction.module2;

//7. Пусть даны две неубывающие последовательности действительных чисел
//a1  a2  an и b1  b2  bm
//.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1  b2  bm
//в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Sort7 {
    public static void main (String[] args) {
        int[] array1 = {1, 3, 10, 13, 95, 105, 131, 155, 200, 202};
        int[] array2 = {1, 4, 7, 12, 92, 117, 142, 167, 200, 201};

        printInsertsPlaces(array1, array2);
    }

    public static void printInsertsPlaces(int[] array1, int[] array2) {
        for (int x = 0; x < array2.length; x++) {
            for (int z = 1; z < array1.length; z++) {
                if (array2[x] > array1[z-1] && array2[x] <= array1[z]) {
                    System.out.println(array2[x] + " вставим между " + array1[z-1] + " и " + array1[z]);
                }
            }
        }
    }


}
