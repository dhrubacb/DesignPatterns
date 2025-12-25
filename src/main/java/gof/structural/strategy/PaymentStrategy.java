package main.java.gof.structural.strategy;

public interface PaymentStrategy {
    void pay(double amount, String... variables);
}
