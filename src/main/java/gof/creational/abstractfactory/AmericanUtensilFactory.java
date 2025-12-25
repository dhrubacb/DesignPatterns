package main.java.gof.creational.abstractfactory;

public class AmericanUtensilFactory implements UtensilFactory {
    @Override
    public Cutlery serveCutlery() {
        return new ForkAndKnife();
    }
}
