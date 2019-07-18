package by.epam.java_introduction.module3;

//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
  //      Крайние пробелы в строке удалить.


public class CharArray5 {
    public static void main (String[] args) {
        String text = " савва савва  савва   савва    савва ";
        System.out.println(text);

        text = text.trim();
        text = text.replaceAll("\\s+", " ");

        System.out.println(text);
    }
}
