package main.java.gof.creational.prototype;

import java.util.LinkedList;

public class CJ extends AvatarPrototype {
    public CJ(int power, String color) {
        super(power, color);
    }

    @Override
    public String getLabel() {
        LinkedList<Integer>[] ls = new LinkedList[10];
        ls[0] = new LinkedList<>();
        ls[0].add(1);
        return "CJ: " + super.toString() + ls[0].getFirst();
    }


}
