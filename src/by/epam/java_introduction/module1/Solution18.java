package by.epam.java_introduction.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution18 {
    // Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    // m и n вводятся с клавиатуры.
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        for (int x = m; x <= n; x++) {
            System.out.println("Число " + x);
            System.out.print("Делители: ");
            for (int x1 = 2; x1 < x; x1++) {
                if((x % x1) == 0) System.out.print(x1+" ");
            }
            System.out.println();
            System.out.println();

        }
    }
}
