package by.epam.java_introduction.module4.agr_comp3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

public class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
