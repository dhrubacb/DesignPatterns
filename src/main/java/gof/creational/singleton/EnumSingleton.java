package main.java.gof.creational.singleton;

public enum EnumSingleton {
    INSTANCE;
    EnumSingleton() { // by default private no need to explicit modifier
        IO.println("Just doing some initials");
    }
    public void doStuff() {
        IO.println("Just doin stuffs");
    }
    public void howIsStuff() {
        IO.println("Stuffs smells good ya");
    }
}
