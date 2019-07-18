package by.epam.java_introduction.module4.Classes3;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.ArrayList;

public class Solution {
    public static void main (String[] args) {
        int countOfStudents = 10;
        ArrayList<Student> list = new ArrayList<>();

        for(int x = 0; x < countOfStudents; x++) {
            int[] rating = new int[5];
            for(int z = 0; z < 5; z++) {
                rating[z] = (int) (10+Math.random()); //
            }
            Student newStud = new Student("Жучик"+x,"С","А",501,rating);
            list.add(newStud);
        }
        Student.printExcellents(list);
    }
}
