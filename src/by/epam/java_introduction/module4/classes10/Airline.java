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

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private byte startTime;
    private String[] daysOfFlight;

    public Airline(String destination, int flightNumber, String aircraftType, byte startTime, String[] daysOfFlight) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.startTime = startTime;
        this.daysOfFlight = daysOfFlight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public byte getStartTime() {
        return startTime;
    }

    public void setStartTime(byte startTime) {
        this.startTime = startTime;
    }

    public String[] getDaysOfFlight() {
        return daysOfFlight;
    }

    public void setDaysOfFlight(String[] daysOfFlight) {
        this.daysOfFlight = daysOfFlight;
    }

    @Override
    public String toString() {
        return "#" + this.flightNumber + " " + this.destination + " " + this.startTime+":00";
    }
}
