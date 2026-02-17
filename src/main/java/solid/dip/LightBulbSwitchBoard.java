package main.java.solid.dip;

public class LightBulbSwitchBoard {
    private final LightBulb lightBulb;

    public LightBulbSwitchBoard(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }
    public void switchOn() {
        lightBulb.on();
    }
}
