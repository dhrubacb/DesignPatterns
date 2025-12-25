package main.java.gof.creational.factory;

public class EmailService implements NotificationService {
    @Override
    public void send(String notification) {
        IO.println("Sending notification through EMAIL: " + notification);
    }
}
