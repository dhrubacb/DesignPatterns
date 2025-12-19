package main.java.creational.factory;

public class NotificationTypeFactory {
    public static NotificationService getNotificationType(int type) {
        return switch (type)  {
            case 1 -> new SmsService();
            case 2 -> new EmailService();
            default -> throw new RuntimeException("Wrong type");
        };
    }
}
