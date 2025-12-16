package main.java.structural.strategy;

public interface PaymentStrategy {
    void pay(double amount, String... variables);
}
