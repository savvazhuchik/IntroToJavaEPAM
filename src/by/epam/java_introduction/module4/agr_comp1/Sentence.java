package by.epam.java_introduction.module4.agr_comp1;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

import java.util.ArrayList;

public class Sentence {
    private String value;

    public Sentence(String text) {
        this.value = text;
    }

    public Sentence(Word ... words) {
        for (int x = 0; x < words.length; x++) {
            this.value += " " + words[x];
        }
    }

    public String getValue() {
        return value;
    }
}
