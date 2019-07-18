package by.epam.java_introduction.module5.task1;

//Задача 1.
//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

import java.io.IOError;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.newTextFile("Savva");
        directory.newTextFile("пароли");
        directory.newTextFile("задачи");
        directory.addStringToTextFile(0,"Савва ел сало да сало было мало");

        directory.printTextFile(0);
        directory.addStringToTextFile(0,"Swaaag");
        directory.printTextFile(0);
        directory.printListOfFiles();
    }
}
