package by.epam.java_introduction.module3;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case

import com.sun.javafx.scene.control.skin.LabeledImpl;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;

public class CharArray1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("camelCase");
        list.add("nitroBoost");
        list.add("countOfPeople");
        list.add("countDoubles");
        list.add("newYork");

        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }

        for (int x = 0; x < list.size(); x++) {
            String replace = list.get(x).replaceAll("(.)(\\p{Upper})", "$1_$2").toLowerCase();
            list.set(x,replace);
        }


        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }
}
