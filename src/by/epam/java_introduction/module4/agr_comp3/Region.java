package by.epam.java_introduction.module4.agr_comp3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;

public class Region {
    private String name;
    private City regionalCenter;
    private ArrayList<Area> areas;

    public Region(String name, City regionalCenter, ArrayList<Area> areas) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        this.areas = areas;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }
}
