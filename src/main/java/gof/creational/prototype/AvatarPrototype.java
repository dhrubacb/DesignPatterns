package main.java.gof.creational.prototype;


public abstract class AvatarPrototype implements Cloneable{
    protected int power;
    protected String color;

    public AvatarPrototype(int power, String color) {
        this.color = color;
        this.power = power;
    }

    public AvatarPrototype(int power) {
        this.power = power;
    }

    public abstract String getLabel();
    @Override
    protected Object clone() {
        Object cl = null;
        try {
            cl  = super.clone();
        } catch (CloneNotSupportedException e) {
           e.printStackTrace();
        }
        return cl;
    }

    @Override
    public String toString() {
        return "AvatarPrototype{" +
                "power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}
