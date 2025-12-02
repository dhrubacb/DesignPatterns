package main.java.structural.decorator;

public class GeneralFee implements Fee {

    @Override
    public double getAmount() {
        return 10;
    }
}
