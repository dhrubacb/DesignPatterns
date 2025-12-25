package main.java.gof.structural.strategy;

public class CheckoutService {
    private PaymentStrategy paymentStrategy;

    public CheckoutService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(final PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount, String... variables) {
        IO.println("Checkout done, processing payment now...");
        if (variables != null && variables.length > 1) {
            IO.println("Note: " + variables[1]);
        }
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount, variables);
        }
    }
}
