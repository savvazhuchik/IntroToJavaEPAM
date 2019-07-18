package by.epam.java_introduction.module4.classes10;

/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.util.ArrayList;

public class Solution {
    public static void main (String[] args) {
        String[] days1 = {"Понедельник", "Четверг"};
        Airline airline1 = new Airline("Москва",7078, "Boijeng", (byte) 16, days1);
        String[] days2 = {"Понедельник", "Суббота"};
        Airline airline2 = new Airline("Питер",7079, "Boijeng", (byte) 18, days2);
        String[] days3 = {"Понедельник", "Суббота"};
        Airline airline3 = new Airline("Луна",7080, "Boijeng", (byte) 10, days3);

        Airline[] airlines = {airline1, airline2, airline3};
        FlightList list = new FlightList(airlines);

        ArrayList<String> check1 = list.getAirlinesByDay("Четверг");
        for (int x = 0; x < check1.size(); x++) {
            System.out.println(check1.get(x));
        }
        System.out.println("-----------------------");
        ArrayList<String> check2 = list.getAirlinesByDay("Понедельник");
        for (int x = 0; x < check2.size(); x++) {
            System.out.println(check2.get(x));
        }
        System.out.println("-----------------------");
        ArrayList<String> check3 = list.getAirlinesByDestination("Луна");
        for (int x = 0; x < check3.size(); x++) {
            System.out.println(check3.get(x));
        }
        System.out.println("-----------------------");
        ArrayList<String> check4 = list.getAirlinesByDay("Луна");
        for (int x = 0; x < check4.size(); x++) {
            System.out.println(check4.get(x));
        }
        System.out.println("-----------------------");
        ArrayList<String> check5 = list.getAirlinesByDayAndHour("Понедельник", (byte)12);
        for (int x = 0; x < check5.size(); x++) {
            System.out.println(check5.get(x));
        }
        System.out.println("-----------------------");
    }
}
