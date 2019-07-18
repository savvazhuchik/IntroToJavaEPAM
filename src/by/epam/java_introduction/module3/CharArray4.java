package by.epam.java_introduction.module3;

// В строке найти количество чисел

public class CharArray4 {
        public static void main(String[] args) {
            String text = "Савва7Савва574nnnnnn7n";
            int countOfNumbers = 0;

            for(int x = 0; x < text.length(); x++) {
                if(Character.isDigit(text.charAt(x))) {
                    countOfNumbers++;
                    for(int z = x; z < text.length(); z++) {
                        if (Character.isDigit(text.charAt(z))) {
                            x++;
                        }
                    }
                }
            }

            System.out.println(countOfNumbers);
    }
}
