package by.epam.java_introduction.module3;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class StringObject1 {
    public static void main (String[] args) {
        String text = " лал   ";

        System.out.println(text);
        char[] textCharArray = text.toCharArray();
        int result = 0;

        for (int x = 0; x < textCharArray.length; x++) {
            if (textCharArray[x] == ' ') {
                for (int z = 1; (x+z < textCharArray.length) && (textCharArray[x+z] == ' '); z++) {
                    if (z > result) {
                        result = z;
                    }
                }
            }
        }
        System.out.println(result+1);       // не знаю почему результат меньше на единицу
    }
}
