package main.java.behavioral.command;

public class Main {
    static void main() {
        TextFile textFile = new TextFile("untitled.txt");
        Runnable openFileCommand = textFile::open;
        Runnable saveFileCommand = textFile::save;
        Runnable closeFileCommand = textFile::close;
        MenuButton openButton = new MenuButton(openFileCommand);
        MenuButton saveButton = new MenuButton(saveFileCommand);
        MenuButton closeButton = new MenuButton(closeFileCommand);
        openButton.click();
        saveButton.click();
        closeButton.click();
    }
}
