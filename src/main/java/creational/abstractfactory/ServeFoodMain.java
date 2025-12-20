package main.java.creational.abstractfactory;

public class ServeFoodMain {

    static void main() {
        String location = "Chinatown";
        IO.println("The customer got served " + getUtensil(location).serveCutlery().getType());

        location = "West Palm Beach, FL";
        IO.println("The customer got served " + getUtensil(location).serveCutlery().getType());
    }

    private static UtensilFactory getUtensil(String location) {
        if (location.equals("Chinatown")) return new ChineseUtensilFactory();
        else return new AmericanUtensilFactory();
    }
}
