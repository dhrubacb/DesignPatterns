package main.java.structural.decorator;

public class FeeDecorator implements Fee {
    protected Fee decoratorFee;
    public FeeDecorator(Fee decoratorFee){
        this.decoratorFee = decoratorFee;
    }

    @Override
    public double getAmount() {
        return decoratorFee.getAmount();
    }
}
