package main.java.gof.behavioral.observer;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Stock implements Subject, PriceUpdatable {
    private final Set<Observer> observers;
    private double price;
    private final String name;

    public Stock(String name, double price) {
        this.observers = new HashSet<>();
        this.name = name;
        this.price = price;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(String.format("Stock: %s Price update to: %s", name, price));
        }
    }

    @Override
    public void updatePrice(double newPrice) {
        if (BigDecimal.valueOf(newPrice).compareTo(BigDecimal.valueOf(this.price)) != 0) {
            this.price = newPrice;
            notifyObservers();
        }
    }
}
