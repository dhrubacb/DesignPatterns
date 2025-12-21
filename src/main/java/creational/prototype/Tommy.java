package main.java.creational.prototype;

public class Tommy extends AvatarPrototype {
    public Tommy(int power) {
        super(power);
        this.color = "LatinWhite";
    }

    @Override
    public String getLabel() {
        return "Tommy: " + super.toString();
    }
    @Override
    protected Object clone() {
        throw new RuntimeException("Tommy is not for sale");
    }
}
