package main.java.solid.ocp.violation;

public class NotificationService {
    public void process(String type, String msg) {
        if ("Email".equals(type)) {
            IO.println("Email: " + msg);
        } else if ("Sms".equals(type)) {
            IO.println("Sms: " + msg);
        }
    }
}
