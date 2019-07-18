package by.epam.java_introduction.module4.agr_comp3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;

public class Area {
    private String name;
    private ArrayList<City> cities;

    public Area(String name, ArrayList<City> cities) {
        this.name = name;
        this.cities = cities;
    }
}
