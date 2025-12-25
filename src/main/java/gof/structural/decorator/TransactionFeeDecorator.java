package main.java.gof.structural.decorator;

public class TransactionFeeDecorator extends FeeDecorator {
    public TransactionFeeDecorator(Fee decoratorFee) {
        super(decoratorFee);
    }

    @Override
    public double getAmount() {
        return 2.0 + super.getAmount();
    }

}
