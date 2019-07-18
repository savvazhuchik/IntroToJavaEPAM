package by.epam.java_introduction.module4.Classes3;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.ArrayList;

public class Student {
    public String surname;
    public String name;
    public String patronymic;
    public int groupNumber;
    public int[] rating = new int[5];

    public Student() {

    }

    public Student (String surname, String name, String patronymic, int groupNumber, int[]rating) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.groupNumber = groupNumber;
        this.rating = rating;
    }

    public static void printAll (ArrayList<Student> list) {
        for (int x = 0; x < list.size(); x++) {
            Student student = list.get(x);
            System.out.print(student.surname+" "+student.name+" "+student.patronymic+" "+student.groupNumber+" "+student.rating);
            System.out.println();
        }
    }

    public static void printExcellents (ArrayList<Student> list) {
        for(int x = 0; x < list.size(); x++) {
            if((list.get(x).rating[0] > 8) && (list.get(x).rating[1] > 8) &&(list.get(x).rating[2] > 8) &&(list.get(x).rating[3] > 8) &&(list.get(x).rating[4] > 8)) {
                System.out.println(list.get(x).surname+" "+list.get(x).groupNumber);
            }
        }
    }

}
