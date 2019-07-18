package by.epam.java_introduction.module4.agr_comp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {                      // Задача сделано плохо и без использования композиции.
    public static void main (String[] args) throws IOException {
        Sentence title = new Sentence("Стих от Саввы");
        Text text = new Text(title);

        text.addBodyText(new Sentence("Савва ел сало да сала было мало"));

        text.printText();
    }
}
