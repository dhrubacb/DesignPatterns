package main.java.creational.prototype;

public class CJ extends AvatarPrototype {
    public CJ(int power, String color) {
        super(power, color);
    }

    @Override
    public String getLabel() {
        return "CJ: " + super.toString();
    }


}
