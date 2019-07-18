package by.epam.java_introduction.module4.agr_comp2;

// Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

public class Car {
    private String mark;
    private Engine engine;
    private Wheel[] wheels;
    private int fuel;

    public Car(String mark, Engine engine, Wheel[] wheels) {
        this.mark = mark;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel = 0;          // допустим 0 - пустой бак, 100 - полный
    }

    public void go() {
        if((this.engine != null) && (this.wheels.length > 2) && (this.fuel > 3)) {  // должен быть двигатель, 4 колеса и немного топлива
            while (this.fuel > 0) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.print(e.getSuppressed());
                }
                System.out.println("Едем! Би-би!");
                this.fuel--;
            }
        } else {
            System.out.println("Чего-то не хватает!");
        }
    }

    public void refuel(int fuel) {
        if ((this.fuel + fuel) > 100) {
            System.out.println("В бак столько не влезет!");
        } else {
            this.fuel += fuel;
            System.out.println("Машина заправленна на " + fuel + " литров");
        }
    }

    public void changeWheel(int oldWheelIndex, Wheel newWheel) {
        this.wheels[oldWheelIndex] = newWheel;
        System.out.println("Колесо заменено!");
    }

    public void printMark() {
        System.out.println(this.mark);
    }
}
