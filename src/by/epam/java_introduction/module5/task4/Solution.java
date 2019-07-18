package by.epam.java_introduction.module5.task4;

//  Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//  дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//  выбора сокровищ на заданную сумму.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cave cave = Cave.getCave();

        System.out.println("-----------------------");
        System.out.println("Welcome to Dragon Cave!");
        System.out.println("-----------------------");
        System.out.println("1. View all treasures");
        System.out.println("2. View the most expensive treasure");
        System.out.println("3. Choice treasures");
        System.out.println("-----------------------");
        System.out.println("Please make a selection [1-3]: ");

        switch (Integer.parseInt(reader.readLine())) {
            case 1:
                cave.viewAllTreasures();
            case 2:
                cave.viewTheMostExpensiveTreasure();
            case 3:
                System.out.println("How much money do you have?");
                cave.buyTreasure(Integer.parseInt(reader.readLine()));
        }
    }
}
