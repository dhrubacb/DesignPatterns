package main.java.behavioral.command;

public class Main {
    static void main() {
        TextFile textFile = new TextFile("untitled.txt");
        Runnable openFile = textFile::open;
        Runnable saveFile = textFile::save;
        Runnable closeFile = textFile::close;
        MenuButton openButton = new MenuButton(openFile);
        MenuButton saveButton = new MenuButton(saveFile);
        MenuButton closeButton = new MenuButton(closeFile);
        openButton.click();
        saveButton.click();
        closeButton.click();
    }
}
