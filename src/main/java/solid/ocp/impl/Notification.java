package main.java.solid.ocp.impl;

interface Notification {
    void send(String msg);
    default void process(String msg, Notification notification){
        notification.send(msg);
    }
}
