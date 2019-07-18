package by.epam.java_introduction.module3;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringObject7 {
    public static void main(String[] args) {
        String string = "Савва жучик";
        string = string.replaceAll("\\s","");

        System.out.print(removeDuplicates(string));
    }

    private static String removeDuplicates(String word) {

        String result = new String("");

        for (int i = 0; i < word.length(); i++) {
            if (!result.contains("" + word.charAt(i))) {
                result += "" + word.charAt(i);
            }
        }

        return result;
    }
}
