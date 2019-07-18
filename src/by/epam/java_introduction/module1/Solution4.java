package by.epam.java_introduction.module1;

public class Solution4 {
    // Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    // дробную и целую части числа и вывести полученное значение числа.
    public static void main (String[] args) {
        double r = 123.876;

        int beforeDot = (int) r;
        String rString = String.valueOf(r);
        int afterDot = Integer.parseInt(rString.substring(4));

        String stringResult = afterDot + "." + beforeDot;            // извращение, конечно
        double result = Double.parseDouble(stringResult);
        System.out.println(result);
    }
}
