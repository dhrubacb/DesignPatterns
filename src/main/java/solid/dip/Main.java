package main.java.solid.dip;
/*
Dependency Inversion Principle:
1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
2. Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions
DI : Dependency Injection = is a design pattern and DIP is a principle/goal
 */
public class Main {
    static void main() {
        // Violation of DIP:
        LightBulbSwitchBoard lightBulbSwitch = new LightBulbSwitchBoard(new LightBulb());
        lightBulbSwitch.switchOn();

        // Fix
        SwitchablePowerBoard switchablePowerBoard = new SwitchablePowerBoard(() -> System.out.println("TV On!"));
        switchablePowerBoard.powerOn();
        switchablePowerBoard.setSwitchable(new Fan());
        switchablePowerBoard.powerOn();
    }
}
