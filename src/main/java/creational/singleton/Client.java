package main.java.creational.singleton;

public class Client {
    static void main() {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.doStuff();
    }
}
