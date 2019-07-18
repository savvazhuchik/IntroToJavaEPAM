package by.epam.java_introduction.module4.Classes4;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

import java.util.ArrayList;
import java.util.Date;

public class Train {
    public int trainNumber;
    public Date timeStart;
    public Date timeFinish;
    public String nameFinish;

    public Train(int trainNumber, Date timeStart, Date timeFinish, String nameFinish) {
        this.trainNumber = trainNumber;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.nameFinish = nameFinish;
    }

    public Train() {
    }

    public static ArrayList<Train> sortForNumber(ArrayList<Train>list) {
        ArrayList<Train> result = new ArrayList<>();
        for (int x = 100; x < 200; x++) {           // пускай диапозон номеров поездов от 100 до 200
            for (int z = 0; z < list.size(); z++) {
                if (list.get(z).trainNumber == x) result.add(list.get(z));
            }
        }
        return result;
    }

    public static void printInfo(int trainNumber, ArrayList<Train>list) {
        Train train = new Train();
        for(int x = 0; x < list.size(); x++) {
            if(list.get(x).trainNumber==trainNumber) train = list.get(x);
        }
        System.out.println("Номер поезда: "+trainNumber+" Врм отпр.: "+train.timeStart+" Врм приб.: "+train.timeFinish+" Куда: "+train.nameFinish);
    }
}
