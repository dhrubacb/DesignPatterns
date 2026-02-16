package main.java.gof.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class BillPughSingleton implements Serializable {
    private BillPughSingleton() {
        throw new RuntimeException("Go for a walk"); // Reflection safe
    }

    private static class SingletonFactory {
        private static final BillPughSingleton BILL_PUGH_SINGLETON = new BillPughSingleton();
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    public static BillPughSingleton getInstance() {
        return SingletonFactory.BILL_PUGH_SINGLETON;
    }
}