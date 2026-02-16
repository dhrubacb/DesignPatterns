package main.java.solid.lsp;

public class LiskovMain {
    static void main() {
        // Liskov Substitution Principle Violation
        double rectangleArea = getAdapterArea(new Rectangle());
        double squareArea = getAdapterArea(new Square());
        if (rectangleArea != squareArea) {
            System.out.println("Liskov Substitution Principle Violated!");
        }
    }
    private static double getAdapterArea(Rectangle rectangle) {
        rectangle.setHeight(10);
        rectangle.setWidth(11);
        return rectangle.getArea();
    }
}
