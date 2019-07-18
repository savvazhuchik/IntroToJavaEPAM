package by.epam.java_introduction.module4.agr_comp3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;

public class State {
    private String name;
    private City capital;
    private ArrayList<Region> regions;
    private int square;

    public State(String name, City capital, ArrayList<Region> regions, int square) {
        this.name = name;
        this.capital = capital;
        this.regions = regions;
        this.square = square;
    }

    public void printCapital() {
        System.out.println("Столица: " + this.capital.getName());
    }

    public void printNumbOfRegions() {
        System.out.println("Кол-во областей: " + this.regions.size());
    }

    public void printSquare() {
        System.out.println("Площадь: " + this.square);
    }

    public void printRegionsCenters() {
        System.out.print("Областные центры: ");
        for (int x = 0; x < regions.size(); x++) {
            System.out.print(regions.get(x).getRegionalCenter().getName() + " ");
        }
        System.out.println();
    }
}
