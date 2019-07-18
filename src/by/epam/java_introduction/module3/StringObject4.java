package by.epam.java_introduction.module3;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class StringObject4 {
    public static void main(String[] args) {
        String word = "информатика";
        String newWord = String.valueOf(word.charAt(7));
        newWord = newWord.concat(word.substring(3,4));
        newWord = newWord.concat(word.substring(4,5));
        newWord = newWord.concat(word.substring(7,8));
        System.out.println(newWord);
    }
}
