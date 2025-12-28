package main.java.solid.ocp.impl;

public class Client {
    static void main() {
        Notification emailNotification = new EmailNotification();
        emailNotification.process("Email Message", emailNotification);
        Notification smsNotification = new SmsNotification();
        smsNotification.process("SMS Message", smsNotification);
    }
}
