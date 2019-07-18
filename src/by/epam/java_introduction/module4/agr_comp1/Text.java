package by.epam.java_introduction.module4.agr_comp1;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

import java.util.ArrayList;

public class Text {
    private String headline;
    private String bodyText;

    public Text(Sentence sentence) {
        this.headline = sentence.getValue();
    }

    public void addBodyText(Word word) {
        bodyText += " " + word.getValue();
    }

    public void addBodyText(Sentence sentence) {
        bodyText += " " + sentence.getValue();
    }

    public void printText () {
        System.out.println(this.headline + "\n");
        System.out.print(this.bodyText);
    }
}
