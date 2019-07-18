package by.epam.java_introduction.module4.agr_comp3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        City city1 = new City("Минск");
        City city2 = new City("Берёза");
        City city3 = new City("Пинск");
        City city4 = new City("Барановичи");
        City city5 = new City("Ивацевичи");
        City city6 = new City("Брест");
        City city7 = new City("Белоозёрск");

        ArrayList<City> cities1 = new ArrayList<>();
        cities1.add(city1);
        ArrayList<City> cities2 = new ArrayList<>();
        cities2.add(city2);
        cities2.add(city7);
        ArrayList<City> cities3 = new ArrayList<>();
        cities3.add(city3);
        ArrayList<City> cities4 = new ArrayList<>();
        cities4.add(city4);
        ArrayList<City> cities5 = new ArrayList<>();
        cities5.add(city5);
        ArrayList<City> cities6 = new ArrayList<>();
        cities6.add(city6);

        Area area1 = new Area("Минский район", cities1);
        Area area2 = new Area("Берёзовский район", cities2);
        Area area3 = new Area("Пинский район", cities3);
        Area area4 = new Area("Барановический район", cities4);
        Area area5 = new Area("Ивацевический район", cities5);
        Area area6 = new Area("Брестский район", cities6);

        ArrayList<Area> areas1 = new ArrayList<>();
        areas1.add(area2);
        areas1.add(area3);
        areas1.add(area4);
        areas1.add(area5);
        areas1.add(area6);

        ArrayList<Area> areas2 = new ArrayList<>();
        areas2.add(area1);

        Region region1 = new Region("Минская область", city1, areas2);
        Region region2 = new Region("Брестская область", city6, areas1);

        ArrayList<Region> regions = new ArrayList<>();
        regions.add(region1);
        regions.add(region2);

        State state = new State("Беларусь", city1, regions, 25000);

        state.printCapital();
        state.printNumbOfRegions();
        state.printRegionsCenters();
        state.printSquare();
    }
}
