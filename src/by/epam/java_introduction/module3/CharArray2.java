package by.epam.java_introduction.module3;

// Замените в строке все вхождения 'word' на 'letter'.

public class CharArray2 {
    public static void main(String[] args) {
        String text = "sex word letter negative";
        System.out.println(text);

        text = text.replace("word","letter");
        System.out.println(text);
    }
}
