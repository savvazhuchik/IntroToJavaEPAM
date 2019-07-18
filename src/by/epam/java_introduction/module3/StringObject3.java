package by.epam.java_introduction.module3;

//3. Проверить, является ли заданное слово палиндромом.

public class StringObject3 {
    public static void main(String[] args) {
        String string = "Топот";

        StringBuffer reverse = new StringBuffer(string).reverse();
        String reverseString = reverse.toString();

        if(string.equalsIgnoreCase(reverseString)) {
            System.out.print("Слово является палиндромом");
        } else {
            System.out.print("Слово не является палиндромом");
        }
    }
}
