package Decorator;

public class GeneralFee implements Fee {

    @Override
    public double getAmount() {
        return 10;
    }
}
