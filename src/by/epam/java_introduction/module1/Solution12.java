package by.epam.java_introduction.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution12 {
    // Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    // все числа от 1 до введенного пользователем числа.
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (int x = 1; x <= number; x++) {
            sum += x;
        }
        System.out.println(sum);
    }
}
