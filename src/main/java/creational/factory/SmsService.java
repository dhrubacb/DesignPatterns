package main.java.creational.factory;

public class SmsService implements NotificationService {
    @Override
    public void send(String notification) {
        IO.println("Sending notification through SMS: " + notification);
    }
}
