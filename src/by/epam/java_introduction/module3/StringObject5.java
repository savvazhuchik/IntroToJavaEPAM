package by.epam.java_introduction.module3;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class StringObject5 {
    public static void main(String[] args) {
        String string = "Савва ел сало, да сало было мало";
        int numberOffA = 0;

        for (int x = 0; x < string.length(); x++) {
            if(string.charAt(x) == 'а') { // кириллица
                numberOffA++;
            }
        }

        System.out.print("Количество букв a: " + numberOffA);
    }
}
