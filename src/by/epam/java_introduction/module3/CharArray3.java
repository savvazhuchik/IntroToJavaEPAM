package by.epam.java_introduction.module3;

//  В строке найти количество цифр.

public class CharArray3 {
    public static void main(String[] args) {
        String text = "Савва7Савва57";
        int countOfNumerals = 0;

        for (int x = 0; x < text.length(); x++) {
            if(Character.isDigit(text.charAt(x))) {
                countOfNumerals++;
            }
        }

        System.out.println(countOfNumerals);
    }
}
