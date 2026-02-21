package main.java.solid.isp.violation;

public class BasicPrinter implements SmartDevice {
    @Override
    public void print() {
        System.out.println("Printing.");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void send() {
        throw new UnsupportedOperationException();
    }
}
