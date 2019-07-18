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

public class FlightList {
    private Airline[] airlines;

    public FlightList(Airline[] airlines) {
        this.airlines = airlines;
    }

    public ArrayList<String> getAirlinesByDestination (String destination) {
        Airline[] list = this.airlines;
        ArrayList <String> result = new ArrayList<>();
        for (int x = 0; x < list.length; x++) {
            if (list[x].getDestination().equals(destination)) {
                result.add(list[x].toString());
            }
        }
        return result;
    }

    public ArrayList<String> getAirlinesByDay (String day) {
        Airline[] list = this.airlines;
        ArrayList <String> result = new ArrayList<>();
        for (int x = 0; x < list.length; x++) {
            for (int z = 0; z < list[x].getDaysOfFlight().length; z++) {
                if (list[x].getDaysOfFlight()[z].equals(day)) {
                    result.add(list[x].toString());
                }
            }
        }
        return result;
    }

    public ArrayList<String> getAirlinesByDayAndHour (String day, byte hour) {
        Airline[] list = this.airlines;
        ArrayList <String> result = new ArrayList<>();
        for (int x = 0; x < list.length; x++) {
            for (int z = 0; z < list[x].getDaysOfFlight().length; z++) {
                if ((list[x].getDaysOfFlight()[z].equals(day)) && (list[x].getStartTime() > hour)) {
                    result.add(list[x].toString());
                }
            }
        }
        return result;
    }
}
