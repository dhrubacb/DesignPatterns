package main.java.solid.ocp.impl;

public class EmailNotification implements Notification {
    private final String TYPE = "Email";
    @Override
    public void send(String msg) {
        IO.println(TYPE + ": " + msg);
    }
}
