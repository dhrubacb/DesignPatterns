package main.java.creational.abstractfactory;

public class AmericanUtensilFactory implements UtensilFactory {
    @Override
    public Cutlery serveCutlery() {
        return new ForkAndKnife();
    }
}
