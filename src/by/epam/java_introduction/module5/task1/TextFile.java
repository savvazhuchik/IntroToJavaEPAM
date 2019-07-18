package by.epam.java_introduction.module5.task1;

import java.util.ArrayList;

public class TextFile extends File {
    private ArrayList<String> strings = new ArrayList<>();

    public void addString(String string) {
        strings.add(string);
    }

    public String getContent() {
        String result = "";
        for (int x = 0; x < strings.size(); x++) {
            result += strings.get(x) + "\n";
        }
        return result;
    }
}
