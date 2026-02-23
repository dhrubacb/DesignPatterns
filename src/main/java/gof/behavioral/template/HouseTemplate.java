package main.java.gof.behavioral.template;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildRoof();
        buildWall();
        paint();
    }

    public void paint() {
        System.out.println("Base colour");
    }

    public void buildWall() {
        System.out.println("Built Wall with cement");
    }

    public final void buildRoof() {
        System.out.println("Roof is inherent property, cant be changed!");
    }

    public final void buildFoundation() {
        System.out.println("Foundation is inherent property, cant be changed!");
    }
}
