package by.epam.java_introduction.module1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution15 {
    // Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static void main (String[] args) {
        BigInteger sum = new BigInteger("1");
        for (int x = 1; x <= 200; x++) {
            sum = sum.multiply(BigInteger.valueOf(x*x));
        }
        System.out.println(sum);
    }
}
