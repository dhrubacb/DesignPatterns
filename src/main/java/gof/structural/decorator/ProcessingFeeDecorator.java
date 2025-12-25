package main.java.gof.structural.decorator;

public class ProcessingFeeDecorator extends FeeDecorator {
    public ProcessingFeeDecorator(Fee decoratorFee) {
        super(decoratorFee);
    }

    @Override
    public double getAmount() {
        return 1.0 + super.getAmount();
    }

}
