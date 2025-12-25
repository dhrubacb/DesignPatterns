package main.java.gof.creational.prototype;

import java.util.LinkedList;

public class Tommy extends AvatarPrototype {
    public Tommy(int power) {
        super(power);
        this.color = "LatinWhite";
    }

    @Override
    public String getLabel() {

        LinkedList<Integer>[] ls = new LinkedList[10];
        ls[0].add(2);

        return "Tommy: " + super.toString() + ls[0].getFirst();
    }
    @Override
    protected Object clone() {
        throw new RuntimeException("Tommy is not for sale");
    }
}
