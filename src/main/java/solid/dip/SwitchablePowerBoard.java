package main.java.solid.dip;

public class SwitchablePowerBoard {
    private Switchable switchable;

    public SwitchablePowerBoard(Switchable switchable) {
        this.switchable = switchable;
    }
    public void powerOn() {
        switchable.on();
    }

    public void setSwitchable(Switchable switchable) {
        this.switchable = switchable;
    }
}
