package main.java.creational.abstractfactory;

public class ChineseUtensilFactory implements UtensilFactory {
    @Override
    public Cutlery serveCutlery() {
        return new Chopstick();
    }
}
