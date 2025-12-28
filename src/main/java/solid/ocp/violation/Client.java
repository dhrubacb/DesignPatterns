package main.java.solid.ocp.violation;

public class Client {
    static void main() {
        NotificationService notificationService = new NotificationService();
        notificationService.process("SMS", "Message");
    }
}
