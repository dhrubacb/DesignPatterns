package main.java.gof.behavioral.command;

public class MenuButton {
    private final Runnable command;

    public MenuButton(Runnable command) {
        this.command = command;
    }
    public void click() {
        if (command != null) {
            command.run();
        }
    }
}
