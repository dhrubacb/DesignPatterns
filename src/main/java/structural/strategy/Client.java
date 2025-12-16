package main.java.structural.strategy;

public class Client {
    static void main() {
        PaymentStrategy card = (_, _) -> IO.println("Payment going through Credit Card");
        CheckoutService checkoutService = new CheckoutService(card);
        checkoutService.checkout(1000.0, "Watch", "Exceeds 500 limit");

        PaymentStrategy wallet = (_, _) -> IO.println("Payment going through Wallet");
        checkoutService.setPaymentStrategy(wallet);
        checkoutService.checkout(10, "Potato", "Within 500 limit");
    }
}
