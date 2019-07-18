package by.epam.java_introduction.module4.agr_comp2;

// Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

public class Solution {
    public static void main (String[] args) {
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
        Wheel wheel5 = new Wheel();

        Wheel[] wheels = new Wheel[4];

        wheels[0] = wheel1;
        wheels[1] = wheel2;
        wheels[2] = wheel3;
        wheels[3] = wheel4;

        Car car = new Car("Mercedes-Benz", new Engine(), wheels);
        car.refuel(50);
        car.go();
        car.changeWheel(0, wheel5);
    }
}
