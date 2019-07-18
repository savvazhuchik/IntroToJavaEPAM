package by.epam.java_introduction.module1;

public class Solution17 {
    // Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
    public static void main (String[] args) {
        String text = "EPAM Systems — американская ИТ-компания, основанная в 1993 году. Крупнейший мировой производитель заказного программного обеспечения, специалист по консалтингу, резидент Белорусского парка высоких технологий.";
        char[] charArray = text.toCharArray();
        for (int x = 0; x < charArray.length; x++) {
            System.out.print(charArray[x] + " - ");
            System.out.println((int)charArray[x]);
        }
    }
}
