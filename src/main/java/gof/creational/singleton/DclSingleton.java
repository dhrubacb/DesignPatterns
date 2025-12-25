package main.java.gof.creational.singleton;

public class DclSingleton {
    private static volatile DclSingleton INSTANCE;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DclSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DclSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
