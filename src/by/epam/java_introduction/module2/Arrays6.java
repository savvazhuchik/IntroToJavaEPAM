package by.epam.java_introduction.module2;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.

import java.math.BigInteger;

public class Arrays6 {
    public static void main (String[] args) {
        int[] array = new int[20];
        int sum = 0;

        for (int x = 0; x < array.length; x++) {
            array[x] = x;
        }

        for (int x = 2; x < array.length; x++) {
            BigInteger integer = BigInteger.valueOf(x);
            boolean isSimpleNumber = integer.isProbablePrime((int) Math.log(x));
            if (isSimpleNumber) sum += array[x];
        }

        System.out.println(sum);
    }
}
