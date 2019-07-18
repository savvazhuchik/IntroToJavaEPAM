package by.epam.java_introduction.module3;

//2. В строке вставить после каждого символа 'a' символ 'b'.

public class StringObject2 {
    public static void main(String[] args) {
        String string = "ccccaaayyy";
        string = string.replace("a","ab");
        System.out.print(string);
    }
}
