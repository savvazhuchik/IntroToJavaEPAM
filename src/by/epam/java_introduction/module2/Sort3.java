package by.epam.java_introduction.module2;

// 3. Сортировка выбором. Дана последовательность чисел
//a1  a2  an
//.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

public class Sort3 {
    public static void main (String[] args) {
        int[] list = {1, 3, 5, 7, 9, 11, 13, 17, 23, 31};

        for (int x = 0; x < list.length/2; x++) {
            int temp1 = list[x];
            int temp2 = list[list.length-1-x];
            list[x] = temp2;
            list[list.length-1-x] = temp1;
        }

        for (int x = 0; x < list.length; x++) {
            System.out.print(list[x] + " ");
        }
    }
}
