package by.epam.java_introduction.module5.task3;

import java.util.ArrayList;

public class Calendar { // class Calendar describes one month
    private ArrayList<Day> days;
    private String monthName;

    private class Day {
        private int number;

        private String note;
    }

    public Calendar() {
    }

    public void initializeCalendar(String monthName) {
        this.days = new ArrayList<>();
        this.monthName = monthName;

        if(monthName.equalsIgnoreCase("january")
                || monthName.equalsIgnoreCase("march")
                || monthName.equalsIgnoreCase("may")
                || monthName.equalsIgnoreCase("march")
                || monthName.equalsIgnoreCase("july")
                || monthName.equalsIgnoreCase("august")
                || monthName.equalsIgnoreCase("march")
                || monthName.equalsIgnoreCase("october")
                || monthName.equalsIgnoreCase("december")) {

            for(int x = 1; x <= 31; x++) {
                Day day = new Day();
                day.number = x;
                day.note = "";
                days.add(day);
            }
        }

        if(monthName.equalsIgnoreCase("april")
                || monthName.equalsIgnoreCase("june")
                || monthName.equalsIgnoreCase("september")
                || monthName.equalsIgnoreCase("november"))
               {

            for(int x = 1; x <= 30; x++) {
                Day day = new Day();
                day.number = x;
                day.note = "";
                days.add(day);
            }

        }
        if(monthName.equalsIgnoreCase("february")) {
            for(int x = 1; x <= 28; x++) {
                Day day = new Day();
                day.number = x;
                day.note = "";
                days.add(day);
            }
        }
    }

    public void print() {
        for(int x = 0; x < this.days.size(); x++) {
            System.out.println((x+1) + " " + this.monthName + " " + this.days.get(x).note);
        }
    }

    public void addNote(int dayNumber, String note) {
        this.days.get(dayNumber-1).note = note;
    }
}
