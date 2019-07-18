package by.epam.java_introduction.module3;

//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class StringObject6 {
    public static void main(String[] args) {
        String string = "Савва";

        string = string.replaceAll(".", "$0$0");

        System.out.print(string);
    }
}
