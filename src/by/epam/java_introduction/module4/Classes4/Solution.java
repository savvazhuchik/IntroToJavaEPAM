package by.epam.java_introduction.module4.Classes4;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами (!)
//назначения должны быть упорядочены по времени отправления. (!)

import java.util.ArrayList;
import java.util.Date;

public class Solution {
    public static void main (String[] args) {
        ArrayList<Train> list = new ArrayList<>();
        list.add(new Train(101,new Date(), new Date(),"Берёза-город"));
        list.add(new Train(102,new Date(), new Date(),"Могилев"));
        list.add(new Train(100,new Date(), new Date(),"Гродно"));
        list.add(new Train(107,new Date(), new Date(),"Берёза-город"));
        list.add(new Train(105,new Date(), new Date(),"Минск"));

        list = Train.sortForNumber(list);
        for(int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x).trainNumber);
        }

        System.out.println("-----------------------------");
        Train.printInfo(107,list);
    }
}
