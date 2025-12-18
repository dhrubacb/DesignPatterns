package main.java.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {
        throw new RuntimeException("Go for a walk"); // Reflection safe
    }

    private static class SingletonFactory {
        private static final BillPughSingleton BILL_PUGH_SINGLETON = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonFactory.BILL_PUGH_SINGLETON;
    }
}