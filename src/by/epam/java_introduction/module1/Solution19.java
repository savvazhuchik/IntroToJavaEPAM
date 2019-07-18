package by.epam.java_introduction.module1;

public class Solution19 {
    // Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void main (String[] args) {
        int a = 54778945;
        int b = 41732154;
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        String[] aArray = aStr.split("");
        String[] bArray = bStr.split("");
        for (int x = 0; x < aArray.length; x++) {
            for(int z = 0; z < bArray.length; z++) {
                if (aArray[x].equals(bArray[z])) System.out.print(aArray[x] + " ");
            }
        }
    }
}
