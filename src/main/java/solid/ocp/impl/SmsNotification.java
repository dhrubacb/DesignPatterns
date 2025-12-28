package main.java.solid.ocp.impl;

public class SmsNotification implements Notification {

    private final String TYPE = "SMS";

    @Override
    public void send(String msg) {
        IO.println(TYPE + ": " + msg);
    }
}
