package main.java.solid.dip;

public class Fan implements Switchable{
    @Override
    public void on() {
        System.out.println("Fan On!");
    }

}
