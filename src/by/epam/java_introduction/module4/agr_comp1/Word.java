package by.epam.java_introduction.module4.agr_comp1;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

public class Word {
    private String value;

    public Word(String word) {
        this.value = word;
    }

    public String getValue() {
        return value;
    }
}
