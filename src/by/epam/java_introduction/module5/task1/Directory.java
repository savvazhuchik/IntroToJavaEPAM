package by.epam.java_introduction.module5.task1;

import java.util.ArrayList;

public class Directory {
    private ArrayList<File> files = new ArrayList<>();

    public void printListOfFiles() {
        for(int x = 0; x < 10; x++) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        }

        for(int x = 0; x < files.size(); x++) {
            System.out.println(x + ". " + files.get(x).getName());
        }
    }

    public void newTextFile(String name) {
        TextFile textFile = new TextFile();
        textFile.setName(name);
        files.add(textFile);
    }

    public void addStringToTextFile(int fileIndex, String string) {
        TextFile textFile = (TextFile) files.get(fileIndex);
        textFile.addString(string);
    }

    public void renameFile(int fileIndex, String newName) {
        File file = files.get(fileIndex);
        file.setName(newName);
        files.set(fileIndex, file);
    }

    public void printTextFile(int fileIndex) {
        TextFile textFile = (TextFile) files.get(fileIndex);
        System.out.println(textFile.getContent());
    }

    public void deleteFile(int fileIndex) {
        files.remove(fileIndex);
    }
}
