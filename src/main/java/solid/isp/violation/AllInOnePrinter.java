package main.java.solid.isp.violation;

public class AllInOnePrinter implements SmartDevice {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void send() {
        System.out.println("Sending...");
    }
}
