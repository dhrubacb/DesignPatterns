package main.java.gof.creational.factory;

public class Client {
    static void main() {
        NotificationService notificationService = NotificationTypeFactory.getNotificationType(1);
        notificationService.send("Dummy");
        notificationService = NotificationTypeFactory.getNotificationType(2);
        notificationService.send("Dummy");
        notificationService = NotificationTypeFactory.getNotificationType(4);
        notificationService.send("Dummy");
    }
}
